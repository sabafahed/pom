package firstProgram;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_JSE {
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	//using JavascripyExecutor to click on login button
	WebElement loginbtn=driver.findElement(By.name("Submit"));
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",loginbtn);
	System.out.println("Login completed");
	Thread.sleep(3000);
	//using JavascripyExecutor to click on logout button
	WebElement logoutbtn=driver.findElement(By.linkText("Logout"));
	JavascriptExecutor executor1=(JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", logoutbtn);
	System.out.println("Logout completed");
	Thread.sleep(3000);
	driver.close();
}
}
