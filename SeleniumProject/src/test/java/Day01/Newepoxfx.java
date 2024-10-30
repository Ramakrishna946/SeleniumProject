package Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Newepoxfx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		
		driver.get("https://app.eposfx.com/epos/login/auth");
		driver.findElement(By.id("username")).sendKeys("balluchi@chefdesk.in");
		driver.findElement(By.id("password")).sendKeys("balluchi@erp");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement element=driver.findElement(By.xpath("//i[@class='bx bx-group']"));
        Actions action=new Actions(driver);
        Actions actions = action.moveToElement(element);
        actions.perform();
        driver.findElement(By.xpath("//li[4]//a[1]//i[2]")).click();
        driver.findElement(By.xpath("//ul[@class='sub-menu']//a[normalize-space()='Customers List']")).click();
              
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='btn btn-warning']")).click();
        Thread.sleep(3000);
    
		
		driver.close();
		driver.quit();
		// TODO Auto-generated method stub

	}

}
