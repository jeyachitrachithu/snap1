package SampleSelenium;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramasamy\\Desktop\\Chithu\\SeleniumJava\\Driver\\ChromeDriver.exe");
WebDriver driver=new ChromeDriver();
	driver.get("https://www.adactin.com/HotelApp/");
	WebElement textlog=driver.findElement(By.id("username"));
	textlog.sendKeys("jeya");
	WebElement userpass=driver.findElement(By.id("password"));
	userpass.sendKeys("9942225");
 
	}
}