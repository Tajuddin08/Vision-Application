package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import BaseLayer.pageClass;

public class TestClass extends BaseClass{
@BeforeTest
public void Setup()
{
	BaseClass.initialize();
}
@Test
public void validateLoginPageFunction()
{
	pageClass page=new pageClass();
	page.LoginPageFunction("Tajuddin", "Shaikh", "Tajshaikh@gmail.com", "Testing", "IT Devloper", "Tajshaikh", "Tajshaikh@123", "Tajshaikh@123", "Pune", "Pune", "Pune", "Maharastra", "413001","India");
}
@AfterTest
public void TearDown()
{
	//driver.quit();
}
}
