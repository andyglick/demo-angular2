package net.xeric.demos.controllers;

import net.xeric.demos.services.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class CounterController {

  @Inject
  CounterService counterService;
  int counter = 1;

  @RequestMapping("/counter")
  public
  @ResponseBody
  int count() {

    return counterService.increment();
  }
}
