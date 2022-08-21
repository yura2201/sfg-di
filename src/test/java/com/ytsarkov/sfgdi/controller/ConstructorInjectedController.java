package com.ytsarkov.sfgdi.controller;

import com.ytsarkov.sfgdi.service.GreetingService;

/**
 * Created by Yuriy Tsarkov on 21.08.2022
 */
public class ConstructorInjectedController {

  private final GreetingService greetingService;

  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
