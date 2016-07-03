package net.xeric.demos.controllers;

import net.xeric.demos.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by markshead on 4/2/16.
 * <p>
 * This tests the controller. It autowires the controller using Spring and verifies that it works
 * as expected. This is different than the service level unit test that are run directly against
 * the class without starting up Spring.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebAppConfiguration
public class RomanControllerIT {

  @Inject
  RomanNumberController romanNumberController;

  @Test
  public void testRoman() throws Exception {

    String result = romanNumberController.toRomanNum(5);
    assertEquals(result, "V");

    result = romanNumberController.toRomanNum(1);
    assertFalse("III".equals(result));
  }
}
