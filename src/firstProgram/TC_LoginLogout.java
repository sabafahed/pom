package firstProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_LoginLogout {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		System.out.println("Application open");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Thread.sleep(3000);
		driver.close();
}
}