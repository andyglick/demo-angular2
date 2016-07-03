package net.xeric.demos;

import net.xeric.demos.pages.DemoPage;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * Created by markshead on 4/2/16.
 * <p>
 * Simple test of Page Object. If this doesn't work, then Cucumber/Selenium tests that use
 * Page Objects probably aren't going to work either.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
// This is for when the app isn't already running
@WebAppConfiguration

// This will startup tomcat before running the test
// @WebIntegrationTest
@Ignore
public class DemoPageIT {
  @Inject
  DemoPage demoPage;

  @Test
  public void simpleTest() {
    demoPage.go();
    demoPage.addNumbers(5, 5);
    assertEquals(10, demoPage.getAdderResults());
  }
}
