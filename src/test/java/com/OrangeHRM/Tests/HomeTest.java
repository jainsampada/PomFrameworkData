package com.OrangeHRM.Tests;

import org.testng.annotations.Test;

import com.OrangeHRM.Pages.HomePage;
import com.OrangeHRM.Testbase.TestBase;

public class HomeTest extends TestBase{
public HomeTest()
{
	super();
	
}
@Test
public void logout()
{
	//HomePage obj=new HomePage();
	//obj.Logout();
	obj.getHome().Logout();
}
}
