package simple;
import java.io.*;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.TabExpander;
 
public class paychex
{
	public static void main(String[] args)
	{
		t3();
		//AndroidDriver();
	}

	public static void t3()   {


   	 MobileDriver PMdriver = new MobileDriver();

	IMobileDevice device = PMdriver.getDevice("0149BCA71700D01F");
	//IMobileDevice device = PMdriver.getDevice("A1A5438E");

    WebDriver  webdriver = device.getDOMDriver ("http://www.paychex.com");
  //	  WebDriver webdriver = new ChromeDriver();


		webdriver.get("http://www.paychex.com");
		webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webdriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);


		WebElement item  = webdriver.findElement(By.xpath(".//*[@id='txtEmployees']"));
		item.sendKeys("300");
		webdriver.findElement(By.xpath(".//*[@id='imgSubmit']")).click();

	//	List<WebElement> we = webdriver.findElements(By.xpath("//input"));
	//	for (Iterator<WebElement> iter = we.iterator(); iter.hasNext(); ) {

	//		WebElement element = iter.next();
	//		System.out.println(" "+element.getAttribute("ID")  + " "+ element.getTagName());



	//	}
		
		 webdriver.findElement(By.xpath("(//input[@id=\"pageContent_formsControl_txtFirstname1_txtFirstname\"])[1]")).sendKeys("uzi");
		 webdriver.findElement(By.xpath("(//input[@id=\"pageContent_formsControl_txtLastname1_txtLastname\"])[1]")).sendKeys("Eilon");
		 webdriver.findElement(By.xpath("(//input[@id=\"pageContent_formsControl_txtPhone1_txtPhone\"])[1]")).sendKeys("55523123112");
		 webdriver.findElement(By.xpath("(//input[@id=\"pageContent_formsControl_txtEmail1_txtEmail\"])[1]")).sendKeys("uzie@perfectomobile.com");
		 webdriver.findElement(By.xpath("(//input[@id=\"pageContent_formsControl_txtCompany1_txtCompany\"])[1]")).sendKeys("Perfecto Mobile");

		try{
			webdriver.quit();

		}catch (Exception e)
		{
		//	e.printStackTrace();
		}


	}

}