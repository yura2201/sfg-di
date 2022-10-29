package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * @author Yuriy Tsarkov (yurait6@gmail.com) on 29.10.2022
 */
@Component
public class SingletonBean {

  public SingletonBean() {
    System.out.println("Creating a Singleton bean!");
  }

  public String getMyScope() {
    return "I'm a Singleton[" + hashCode() + "]";
  }
}
