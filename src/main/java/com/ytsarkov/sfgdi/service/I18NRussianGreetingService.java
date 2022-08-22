package com.ytsarkov.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Yuriy Tsarkov on 22.08.2022
 */
@Profile({ "RU", "default" })
@Service("i18nService")
public class I18NRussianGreetingService implements GreetingService {
  @Override public String sayGreeting() {
    return "Привет, Мир!";
  }
}
