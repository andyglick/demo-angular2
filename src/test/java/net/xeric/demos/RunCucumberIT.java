package net.xeric.demos;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;

@RunWith(Cucumber.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebIntegrationTest
@CucumberOptions(tags = {"@ok"}, plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json",
  "usage:target/cucumber-usage.json"})
public class RunCucumberIT {
}
