package com.ytsarkov.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ytsarkov.sfgdi.service.GreetingService;

/**
 * Created by Yura on 21.08.2022
 */
@Controller
public class PropertyInjectedController {

  @Autowired
  @Qualifier("propertyInjectedGreetingService")
  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
