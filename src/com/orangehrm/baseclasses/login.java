package com.orangehrm.baseclasses;

import java.io.IOException;

import org.mockito.internal.stubbing.answers.ThrowsException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pom.loginpage;

public class login extends constants {
@Test
public void logintest() throws IOException
{
	driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrm.com/");
	driver.manage().window().maximize();
	
	loginpage lp=PageFactory.initElements(driver, loginpage.class);
	System.out.println("dddddddddddd");
	String runmode=eo.getcelldata(dataenginepath, 0, 1, 2);
	
	System.out.println(runmode);
	if (runmode.equals("N")) 
	{
	throw new SkipException("skip login test");	
	}
	else
	{
	lp.LOGINPanel("Admin","admin");
  }
	}
}
