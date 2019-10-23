package message;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args)
	{
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://web.whatsapp.com/");
	  driver.manage().window().maximize();
	  

	}

}
