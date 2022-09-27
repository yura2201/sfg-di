package guru.springframework.sfgdi.repository;

/**
 * @author Yuriy Tsarkov (yurait6@gmail.com) on 27.09.2022
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

  @Override
  public String getGreeting() {
    return "Hello World - EN";
  }
}
