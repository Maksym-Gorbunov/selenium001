package htmlunitdriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import java.lang.reflect.Field;

public class HtmlUnitDriverTest {

  public static void main(String[] args) throws Exception {
    //HtmlUnitDriver driver = new HtmlUnitDriver();
    HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
    driver.get("https://www.seleniumhq.org/");
    System.out.println("Title: " + driver.getTitle());

    //WebClient
    WebClient webClient = (WebClient) get(driver, "webClient");
    System.out.println("Browser is Chrome : " + webClient.getBrowserVersion().isChrome());
    System.out.println("Browser version : " + webClient.getBrowserVersion());
    driver.quit();
  }


  //Get browser version
  private static Object get(Object object, String field) throws Exception{
    Field f = object.getClass().getDeclaredField(field);
    f.setAccessible(true);
    return f.get(object);
  }

  public class A{
    public String name = "max";
  }
}
