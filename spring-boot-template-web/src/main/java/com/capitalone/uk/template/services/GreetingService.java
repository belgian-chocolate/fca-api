package com.capitalone.uk.template.services;

import com.capitalone.uk.template.models.Greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

  private static final String template = "Hello, %s!";

  public String getGreeting(String name) {
    return String.format(template, name);
  }
}
