package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Epofx {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
		
driver.get("https://app.eposfx.com/epos/login/auth");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		driver.findElement(By.id("username")).sendKeys("balluchi@chefdesk.in");
		driver.findElement(By.id("password")).sendKeys("balluchi@erp");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//i[@class='bx bx-group']"));
        Actions action = new Actions(driver);
        Actions actions = action.moveToElement(element);
        actions.perform();
        driver.findElement(By.xpath("//li[4]//a[1]//i[2]")).click();
        driver.findElement(By.xpath("//ul[@class='sub-menu']//a[normalize-space()='Customers List']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-warning']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("name");
        driver.findElement(By.xpath("//input[@id='contactPerson']")).sendKeys("Contact_Person");
        driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("Phone_Number");
        
        Thread.sleep(3000);
        
        Actions action1 = new Actions(driver);
        WebElement we1 = driver.findElement(By.xpath("//label[@for='enableCredit']"));
        action1.moveToElement(we1).click().build().perform();
        Actions action2 = new Actions(driver);
        WebElement we2 = driver.findElement(By.xpath("//label[@for='active']"));
        action2.moveToElement(we2).click().build().perform();
        
        Thread.sleep(3000);
		
		//driver.close();
		//driver.quit();
		
		// TODO Auto-generated method stub

	}

}
