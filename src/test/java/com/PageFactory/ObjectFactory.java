package com.PageFactory;

import com.OrangeHRM.Pages.HomePage;
import com.OrangeHRM.Pages.LoginPage;

public class ObjectFactory {
	private LoginPage loginobj;
	private HomePage homeobj;

	public LoginPage getLogin()
	{
		if(loginobj==null)
		{
			loginobj=new LoginPage();
		}
		return loginobj;
	}
	
	public HomePage getHome()
	{
		if(homeobj==null)
		{
			homeobj=new HomePage();
		}
		return homeobj;
	}
}
