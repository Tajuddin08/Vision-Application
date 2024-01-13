package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static	WebDriver driver;
	protected static Properties prop;
	public BaseClass() 
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigLayer\\abc.propties");
		FileInputStream fis;

		   
		try {
			fis=new FileInputStream(f);
			prop=new Properties();
			try {
				prop.load(fis);
			}catch(IOException e) {
				
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	
	
			
		}

	public static void initialize()
	{
		String url=prop.getProperty("url");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get(url);
		
	
	}

}
