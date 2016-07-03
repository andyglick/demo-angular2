package net.xeric.demos.services;

import org.springframework.stereotype.Service;

@Service
public class CounterService {
  int count = 0;

  public int increment() {
    return count++;
  }
}
