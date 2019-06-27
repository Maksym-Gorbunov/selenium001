package test001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test001 {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");

        System.setProperty("webdriver.gecko.driver", projectPath+"\\lib\\geckodriver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", projectPath+"\\lib\\chromedriver\\chromedriver.exe");
        WebDriver driverChrome = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        driverChrome.get("http://maxcoder.pro");
        driver.get("https://yandex.ru");
//        driver.quit();
    }
}
