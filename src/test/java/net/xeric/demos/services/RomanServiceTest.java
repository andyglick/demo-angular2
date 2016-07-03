package net.xeric.demos.services;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanServiceTest {

  RomanNumberService romanService = new RomanNumberService();

  @Test
  public void testRoman() throws Exception {

    assertEquals("I", romanService.toRoman(1));
    assertEquals("V", romanService.toRoman(5));
  }
}
