package webdriver_Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class trial {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); 
		
		/*System.setProperty("webdriver.chrome.silentOutput", "true"); */
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://studyabroad.shiksha.com/"); 
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		String title = driver.getTitle(); 
		System.out.println(title);
	
		//Mouse over on Colleges and click MS in Computer Science &Engg under MS Colleges  
		Actions builder=new Actions(driver); 	
		builder.moveToElement(driver.findElementByXPath("//label[text()='Colleges ']")).pause(2000).perform(); 
		driver.findElementByXPath("//label[text()='MS Colleges']/following-sibling::ul//a[text()='MS in Computer Science &Engg']").click();
		System.out.println("mm");
		driver.findElementByXPath("//p[text()='GRE']/parent::label").click();
		
		System.out.println("ss");
		Thread.sleep(1000);
		WebElement web = driver.findElementByXPath("//p[text()='GRE']/parent::label/following-sibling::div/select");
		Select dd=new Select(web);
		/* dd.selectByVisibleText("310 & below"); */
		
		List<WebElement> options = dd.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			
			System.out.println(options.get(1));
			
		}
		
		System.out.println("chintu");
		/*
		 * Select dd = new Select(web); dd.deselectByVisibleText("GRE");
		 */
		
		/*
		 * 
		 * 
		 * ).click();
		 */
		
	}
}