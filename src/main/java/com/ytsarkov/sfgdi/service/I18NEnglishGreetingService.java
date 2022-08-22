package com.ytsarkov.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Yuriy Tsarkov on 22.08.2022
 */
@Profile("EN")
@Service("i18nService")
public class I18NEnglishGreetingService implements GreetingService {
  @Override public String sayGreeting() {
    return "Hello World!";
  }
}
