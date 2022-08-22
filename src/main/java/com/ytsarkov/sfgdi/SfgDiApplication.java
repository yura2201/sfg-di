package com.ytsarkov.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ytsarkov.sfgdi.controller.ConstructorInjectedController;
import com.ytsarkov.sfgdi.controller.I18NController;
import com.ytsarkov.sfgdi.controller.MyController;
import com.ytsarkov.sfgdi.controller.PropertyInjectedController;
import com.ytsarkov.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

    I18NController i18NController = (I18NController) ctx.getBean("i18NController");
    System.out.println(i18NController.sayHello());

    MyController myController = (MyController) ctx.getBean("myController");
    System.out.println("---------- Primary bean");
    System.out.println(myController.sayHello());

    System.out.println("---------- Property");

    PropertyInjectedController propertyInjectedController =
        (PropertyInjectedController) ctx.getBean("propertyInjectedController");

    System.out.println(propertyInjectedController.getGreeting());

    System.out.println("---------- Setter");
    SetterInjectedController setterInjectedController =
        (SetterInjectedController) ctx.getBean("setterInjectedController");

    System.out.println(setterInjectedController.getGreeting());

    System.out.println("---------- Constructor");

    ConstructorInjectedController constructorInjectedController =
        (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
    System.out.println(constructorInjectedController.getGreeting());
  }

}
