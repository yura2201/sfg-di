package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repository.EnglishGreetingRepository;

/**
 * Created by jt on 12/27/19.
 */
public class I18nEnglishGreetingService implements GreetingService {

  private final EnglishGreetingRepository englishGreetingRepository;

  public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
    this.englishGreetingRepository = englishGreetingRepository;
  }

  @Override
  public String sayGreeting() {
    return "Hello World - EN";
  }
}
