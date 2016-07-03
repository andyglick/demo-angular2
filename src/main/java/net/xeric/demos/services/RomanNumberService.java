package net.xeric.demos.services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class RomanNumberService {

  /**
   * @param num
   * @return
   */
  private LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<>();

  public static String repeat(String s, int n) {
    if (s == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(s);
    }
    return sb.toString();
  }

  @PostConstruct
  public void load() {
    loadRomanData();
  }

    private void loadRomanData() {

    roman_numerals.put("M", 1000);
    roman_numerals.put("CM", 900);
    roman_numerals.put("D", 500);
    roman_numerals.put("CD", 400);
    roman_numerals.put("C", 100);
    roman_numerals.put("XC", 90);
    roman_numerals.put("L", 50);
    roman_numerals.put("XL", 40);
    roman_numerals.put("X", 10);
    roman_numerals.put("IX", 9);
    roman_numerals.put("V", 5);
    roman_numerals.put("IV", 4);
    roman_numerals.put("I", 1);
  }

  /**
   * @param Int -- the integer input value which if legal
   *   will be converted to a Roman numeral
   * @return int value converted to Roman integer
   */
  public String toRoman(int Int) {

    if (roman_numerals == null || roman_numerals.isEmpty()) {
      loadRomanData();
    }

    String res = "";

    for (Map.Entry<String, Integer> entry : roman_numerals.entrySet()) {
      int matches = Int / entry.getValue();
      res += repeat(entry.getKey(), matches);
      Int = Int % entry.getValue();
    }
    return res;
  }
}
