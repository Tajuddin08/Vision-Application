package BaseLayer;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pageClass extends BaseClass{

		
	

	@FindBy(name="input_1")
	private WebElement Fname;
	@FindBy(name="input_2")
	private WebElement Lname;
	@FindBy(name="input_3")
	private WebElement Email;
	@FindBy(name="input_7")
	private WebElement BName;
	@FindBy(name="input_8")
	private WebElement Job;
	@FindBy(name="input_4")
	private WebElement Uname;
	@FindBy(name="input_5")
	private WebElement Pass;
	@FindBy(name="input_5_2")
	private WebElement Cpass;
	@FindBy(name="input_9.1")
	private WebElement Sadd;
	@FindBy(name="input_9.2")
	private WebElement Add2;
	@FindBy(name="input_9.3")
	private WebElement City;
	@FindBy(name="input_9.4")
	private WebElement State;
	@FindBy(name="input_9.5")
	private WebElement Zip;
	@FindBy(name="input_9.6")
	private WebElement Country;
	@FindBy(id="gform_submit_button_1")
	private WebElement Sub;


public  pageClass()
{
	PageFactory.initElements(driver, this);
	
}
public void LoginPageFunction(String fname,String lname,String email,String bname,String job,
	String	uname,String pass,String cpass,String sAdd,String add2,String city,String state,String zip,String country)
{
	Fname.sendKeys(fname);
	Lname.sendKeys(lname);
	Email.sendKeys(email);
	BName.sendKeys(bname);
	Job.sendKeys(job);
	Uname.sendKeys(uname);
	Pass.sendKeys(pass);
	Cpass.sendKeys(cpass);
	Sadd.sendKeys(sAdd);
	Add2.sendKeys(add2);
	City.sendKeys(city);
	State.sendKeys(state);
	Zip.sendKeys(zip);
	Select sel =new Select(Country);
	sel.selectByVisibleText(country);
	
	
	
}

}