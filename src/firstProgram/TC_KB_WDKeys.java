package firstProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_KB_WDKeys {
	public static void main(String args[]) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com//");
	Thread.sleep(5000);
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(5000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.close();
}
}