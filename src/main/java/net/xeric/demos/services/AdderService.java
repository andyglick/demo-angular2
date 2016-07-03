package net.xeric.demos.services;

import org.springframework.stereotype.Service;

@Service
public class AdderService {

  public int add(int x, int y) {
    return x + y;
  }
}
