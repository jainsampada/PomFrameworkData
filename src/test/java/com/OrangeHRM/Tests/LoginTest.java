package com.OrangeHRM.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.OrangeHRM.Pages.LoginPage;
import com.OrangeHRM.Testbase.TestBase;
import com.PageFactory.ObjectFactory;

public class LoginTest extends TestBase{
//LoginPage loginpage;
	
String title;
public LoginTest()
{
	super();
}
@BeforeSuite
public void Launch()
{
	initialization();
//	loginpage=new LoginPage();
}

@Test
public void CheckTitle()
{
	//title=loginpage.Verifytitle();
	title=obj.getLogin().Verifytitle();
	Assert.assertEquals(title, "OrangeHRM");
}
@Test
public void logindetails()
{
	obj.getLogin().login();
}
@Test
public void ForgetPass()
{	
obj.getLogin().forgetpass();
}
}
