package com.OrangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Testbase.TestBase;

public class HomePage extends TestBase {
@FindBy(partialLinkText="Welcome")
WebElement logout;

@FindBy(linkText="Logout")
WebElement logout_button;


public HomePage()
{
	PageFactory.initElements(driver, this);
}
public void Logout()
{
	logout.click();
	logout_button.click();
}
}
