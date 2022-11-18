package firstProgram;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_DragDrop {
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://jqueryui.com/droppable/");
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	System.out.println("Title matched");
	driver.switchTo().frame(0);
	Actions obj=new Actions(driver);
	obj.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
	System.out.println("DragDrop");
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.close();
}
}