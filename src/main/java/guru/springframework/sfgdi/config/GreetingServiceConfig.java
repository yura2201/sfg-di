package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repository.EnglishGreetingRepository;
import guru.springframework.sfgdi.repository.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.I18NSpanishService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;

/**
 * @author Yuriy Tsarkov (yurait6@gmail.com) on 14.09.2022
 */
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

  @Bean
  PetServiceFactory petServiceFactory() {
    return new PetServiceFactory();
  }

  @Profile({ "dog", "default" })
  @Bean
  PetService dogPetService(PetServiceFactory petServiceFactory) {
    return petServiceFactory.getPetService("dog");
  }

  @Profile("cat")
  @Bean
  PetService catPetService(PetServiceFactory petServiceFactory) {
    return petServiceFactory.getPetService("cat");
  }

  @Profile({ "ES", "default" })
  @Bean("i18nService")
  I18NSpanishService i18NSpanishService() {
    return new I18NSpanishService();
  }

  @Bean
  EnglishGreetingRepository englishGreetingRepository() {
    return new EnglishGreetingRepositoryImpl();
  }

  @Profile("EN")
  @Bean
  I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
    return new I18nEnglishGreetingService(englishGreetingRepository);
  }

  @Primary
  @Bean
  PrimaryGreetingService primaryGreetingService() {
    return new PrimaryGreetingService();
  }

  @Bean
  PropertyInjectedGreetingService propertyInjectedGreetingService() {
    return new PropertyInjectedGreetingService();
  }

  @Bean
  SetterInjectedGreetingService setterInjectedGreetingService() {
    return new SetterInjectedGreetingService();
  }

  @Bean
  FakeDataSource fakeDataSource(@Value("${guru.username}") String username,
      @Value("${guru.password}") String password,
      @Value("${guru.jdbc-url}") String jdbcUrl) {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUsername(username);
    fakeDataSource.setPassword(password);
    fakeDataSource.setJdbcUrl(jdbcUrl);

    return fakeDataSource;
  }
}
