package com.ytsarkov.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World - ConstructorGreetingService";
  }
}
