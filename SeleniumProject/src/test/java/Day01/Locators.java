package Day01;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//WebDriverDecorator driver=new WebDriverDecorator();
		
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		boolean logo=driver.findElement(By.id("logo")).isDisplayed();
		Thread.sleep(3000);
		
		List<WebElement> links=driver.findElements(By.className("nav-item"));
		
		System.out.println("Total No Of links:" +links.size());
		
for(WebElement LinkText :links) {
			
			String LinkText2=LinkText.getText();
			
			
			System.out.println( LinkText2);
		}
		
		driver.findElement(By.name("search")).sendKeys("iphone");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Desktops")).click();
		
		Thread.sleep(3000);
		//boolean logo=driver.findElement(By.id("logo")).isDisplayed();
		
		System.out.println(logo);
		
		
		
		Thread.sleep(3000);
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> TotalLinks = driver.findElements(By.tagName("li"));
		Thread.sleep(3000);
		
		
		
		/*for(int i = 0; i<=TotalLinks.size(); i++) {
			
			System.out.println( i);
			
			}*/
		
          for(WebElement LinkText :TotalLinks) {
			
			String LinkText1=LinkText.getText();
			
			
			System.out.println( LinkText1);
		}
		
		System.out.println("Total Links in Orange HRM:"+ TotalLinks.size());
		
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Book a")).click();
		
		String Title =driver.getTitle();
		
		System.out.println(Title);
		
		
		
		Thread.sleep(3000);
		
		
		driver.close();
		
		
	}

}
