package com.ytsarkov.sfgdi.controller;

import com.ytsarkov.sfgdi.service.GreetingService;

/**
 * Created by Yura on 21.08.2022
 */
public class PropertyInjectedController {

  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
