package config;


/**
* This class has access to config.properties
 * Read/Write
* */

import test001.SeleniumTest001;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesFile {
  static Properties prop = new Properties();
  static String projectPath = "c:\\java\\selenium001";
//  static String projectPath = System.getProperty("user.dir");

  public static void main(String[] args) {
    writePropertiesFile();
    readPropertiesFile();
  }

  //Get data from config file
  public static void readPropertiesFile(){
    try{
      InputStream input = new FileInputStream(projectPath+"\\src\\config\\config.properties");
      prop.load(input);
      System.out.println(prop.getProperty("browser"));
      SeleniumTest001.browser = prop.getProperty("browser");
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  //Write properties to config
  public static void writePropertiesFile(){
    try {
      OutputStream output = new FileOutputStream(projectPath+"\\src\\config\\config.properties");
      prop.setProperty("browser", "Chrome");
      prop.setProperty("test", "ok");
      //prop.store(output, "Current webbrowser");
      prop.store(output, null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Add/edit property in config file
  public static void writeProperty(String property, String value){
    try {
      OutputStream output = new FileOutputStream(projectPath+"\\src\\config\\config.properties");
      prop.setProperty(property, value);
      prop.store(output, null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Get property value from config file
  public static String getPropertyValue(String property){
    try{
      InputStream input = new FileInputStream(projectPath+"\\src\\config\\config.properties");
      prop.load(input);
      return prop.getProperty(property);
    }catch (Exception e){
      e.printStackTrace();
    }
    return null;
  }

}
