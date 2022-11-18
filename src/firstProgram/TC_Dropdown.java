package firstProgram;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Open Application");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
//dropdown
driver.switchTo().frame("rightMenu");
Select st=new Select(driver.findElement(By.name("loc_code")));
//st.selectByVisibleText("Emp.ID");
st.selectByValue("0");
Thread.sleep(3000);
driver.findElement(By.name("loc_name")).sendKeys("0192");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Search']")).click();
Thread.sleep(3000);
driver.findElement(By.name("chkLocID[]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Delete']")).click();
//exit frame
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.close();
}
}