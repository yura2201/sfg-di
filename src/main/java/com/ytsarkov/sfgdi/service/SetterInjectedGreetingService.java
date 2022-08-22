package com.ytsarkov.sfgdi.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Yuriy Tsarkov on 22.08.2022
 */
@Service
public class SetterInjectedGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello from SetterInjectedGreetingService!";
  }
}
