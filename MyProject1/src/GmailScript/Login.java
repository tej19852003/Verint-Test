package GmailScript;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Login {

	public static boolean login1() throws Exception {
		
		System.out.println("Login method started....");
		
//		File file = new File("C:\\Softwares\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
//		WebDriver driver = new ChromeDriver();
		
		
		File file = new File("C:\\Softwares\\IEDriverServer.exe");

		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver;
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		Thread.sleep(5000);
		driver = new InternetExplorerDriver();	
		Thread.sleep(2000);	
		
		try{		
		driver.navigate().to("www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//	    driver.switchTo().window(tabs2.get(1));
//	    driver.close();
//	    driver.switchTo().window(tabs2.get(0));
		
		
		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("next")).click();
		
		System.out.println("Login method Ended....");
		
		}catch(Exception e){
			System.out.println(e);
		}finally{
			driver.close();
		}
		
		
		return false;
		
	
	}
	

}
