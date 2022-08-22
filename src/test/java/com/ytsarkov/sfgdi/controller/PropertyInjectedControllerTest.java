package com.ytsarkov.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ytsarkov.sfgdi.service.ConstructorGreetingService;

class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new PropertyInjectedController();

    controller.greetingService = new ConstructorGreetingService();
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}