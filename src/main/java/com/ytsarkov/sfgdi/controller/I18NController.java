package com.ytsarkov.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ytsarkov.sfgdi.service.GreetingService;

/**
 * Created by Yuriy Tsarkov on 22.08.2022
 */
@Controller
public class I18NController {

  private final GreetingService greetingService;

  public I18NController(@Qualifier("i18nService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
