package net.xeric.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is the Spring configuration file which provides the mechanism that allows us to get the proper webdriver.
 */
@Configuration
public class TestConfig {

  private WebDriver webDriver = new PhantomJSDriver();

  @Bean(destroyMethod = "quit")
  public WebDriver getWebDriver() {

    String browserName = System.getProperty("browser.name", "phantomjs");

    switch (browserName) {
      case "firefox":
        webDriver = new FirefoxDriver();
        break;
      case "chrome":
        webDriver = new ChromeDriver();
        break;
      case "phantomjs":
        break;
      default:
        throw new RuntimeException("the browser.name System property value doesn't match the values in the existing "
        + " enumeration {chrome, firefox, phantomjs");
    }

    return webDriver;
  }
}
