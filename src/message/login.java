package message;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "192.168.1.201:3017");
		
		WebDriver driver= new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='side']/div[1]/div/label/input")).sendKeys("Hero");		
		
	}

}
