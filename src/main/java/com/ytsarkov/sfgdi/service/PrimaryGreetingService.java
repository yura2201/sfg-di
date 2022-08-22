package com.ytsarkov.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Yuriy Tsarkov on 22.08.2022
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
  @Override public String sayGreeting() {
    return "Hello from Primary bean!";
  }
}
