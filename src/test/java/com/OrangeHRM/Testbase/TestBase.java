package com.OrangeHRM.Testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageFactory.ObjectFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public  static Properties prop;
	public static WebDriver driver;
	protected static ObjectFactory obj;
public TestBase()
{
	try
	{
	FileInputStream ip=new FileInputStream("E:\\Sampada\\Infostride\\com.OrangelivePOM\\src\\test\\java\\com\\OrangeHRM\\configuration\\config.properties");
	
	prop=new Properties();
	
	prop.load(ip);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
public static void initialization()
{
	obj=new ObjectFactory();
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	driver.get(prop.getProperty("url"));
}
}
