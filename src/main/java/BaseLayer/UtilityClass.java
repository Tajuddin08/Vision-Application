package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass extends BaseClass{
	
	public static void selectByVisibleText(WebElement wb,String value) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel=new Select(wb);
		sel.selectByVisibleText(value);
	}
	public static void SelectByValue(WebElement wb,String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel=new Select(wb);
		sel.selectByValue(value);
	}
	public static void SelectByIndex(WebElement wb,int value)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
		new Select(wb).selectByIndex(value);
	}

	public static void AlertPop()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		 alt.accept();
		
	}

	public static void dismiss()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		alt.dismiss();
	}
	public static void SendKeys(String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	Alert alt=wait.until(ExpectedConditions.alertIsPresent());
	alt.sendKeys(value);
	
	}
	public static String getText()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		String a=alt.getText();
		return a;
	}
		



}

