package firstProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class TC_fileupload {
	public static void main(String args[]) throws Exception {
	
	System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Open Application");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);

driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add']")).click();
driver.findElement(By.name("txtEmpFirstName")).sendKeys("saba");
driver.findElement(By.name("txtEmpLastName")).sendKeys("sheikh");
WebElement fileInput=driver.findElement(By.xpath("//input[@name='photofile'][@type='file']"));
 fileInput.sendKeys("C:\\Users\\sabafahed\\Pictures\\sabafahed\\foodzone.jpg");
driver.findElement(By.xpath("//input[@class='savebutton']")).click();
System.out.println("new emp added");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
Thread.sleep(3000);
driver.close();
}
}
	
	
		
	