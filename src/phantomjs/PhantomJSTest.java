package phantomjs;

import Info.Info;

public class PhantomJSTest {
  public static void main(String[] args) {
    System.setProperty("phantomjs.binary.path", Info.projectPath+"\\lib\\phantomjs\\phantomjs.exe");
    // Not supported in Selenium 3
    //PhantomJSDriver driver = new PhantomJSDriver();
  }
}
