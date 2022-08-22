package com.ytsarkov.sfgdi.service;

import org.springframework.stereotype.Service;

/**
 * Created by Yuriy Tsarkov on 22.08.2022
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
  @Override public String sayGreeting() {
    return "Hello from PropertyInjectedGreetingService!";
  }
}
