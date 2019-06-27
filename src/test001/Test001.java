package test001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test001 {
  static String browser;
  static WebDriver driver;
  public static void main(String[] args) {
    setBrowser();
    setBrowserConfig();
    runTest();
  }

  //set Browser
  public static void setBrowser(){
    browser = "Firefox";
  }

  //set Browser Config
  public static void setBrowserConfig(){
    String projectPath = System.getProperty("user.dir");
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
