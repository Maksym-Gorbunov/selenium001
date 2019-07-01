package test001;

/**
 * Selenium
 */

import config.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest001 {
  public static String browser;
  static WebDriver driver;
  static String projectPath = "c:\\java\\selenium001";
//  static String projectPath = Info.Info.getProperty("user.dir");

  public static void main(String[] args) {
    System.out.println("selenium001...");
    PropertiesFile.readPropertiesFile();
    setBrowserConfig();
    runTest();
    PropertiesFile.writeProperty("browser", "Chrome");
    System.out.println(PropertiesFile.getPropertyValue("empty"));
    System.out.println(PropertiesFile.getPropertyValue("browser"));
  }

  //set Browser Config
  public static void setBrowserConfig(){
    if(browser.contains("Firefox")){
      System.setProperty("webdriver.gecko.driver", projectPath+"\\lib\\geckodriver\\geckodriver.exe");
      driver = new FirefoxDriver();
    }
    if(browser.contains("Chrome")){
      System.setProperty("webdriver.chrome.driver", projectPath+"\\lib\\chromedriver\\chromedriver.exe");
      driver = new ChromeDriver();
    }
  }

  //run Test
  public static void runTest(){
    driver.get("https://www.seleniumhq.org/");
    driver.quit();
  }
}
