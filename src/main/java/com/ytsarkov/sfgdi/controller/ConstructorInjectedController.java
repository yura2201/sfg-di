package com.ytsarkov.sfgdi.controller;

import org.springframework.stereotype.Controller;

import com.ytsarkov.sfgdi.service.GreetingService;

/**
 * Created by Yuriy Tsarkov on 21.08.2022
 */
@Controller
public class ConstructorInjectedController {

  private final GreetingService greetingService;

  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
