package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Yuriy Tsarkov (yurait6@gmail.com) on 29.10.2022
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

  public PrototypeBean() {
    System.out.println("Creating a Prototype bean!");
  }

  public String getMyScope() {
    return "I'm a Prototype[" + hashCode() + "] Bean!!";
  }
}
