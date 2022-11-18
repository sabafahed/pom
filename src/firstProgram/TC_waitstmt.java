package firstProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TC_waitstmt {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Open Application");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	//explicit wait
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
	wait.until(ExpectedCondition.elementToBeClickable(driver.findElement(By.name("Submit"))));
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.close();
}
}