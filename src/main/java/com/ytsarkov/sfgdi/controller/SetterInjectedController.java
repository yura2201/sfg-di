package com.ytsarkov.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ytsarkov.sfgdi.service.GreetingService;

/**
 * Created by Yuriy Tsarkov on 21.08.2022
 */
@Controller
public class SetterInjectedController {

  private GreetingService greetingService;

  @Autowired
  @Qualifier("setterInjectedGreetingService")
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
