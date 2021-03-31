package webdriver_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(500);
		
		/*
		 * driver.findElementByXPath(//button[text()='✕']);
		 */		
		
	/*	driver.findElementById("exehdJ");
		Select dd = new Select(web);*/
		
		dd.selectByVisibleText("Notification Preferences");
		driver.close();

	}

}
