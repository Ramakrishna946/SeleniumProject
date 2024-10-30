package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				WebDriver driver=new ChromeDriver();
				
				driver.get("https://demo.nopcommerce.com/");
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				Thread.sleep(3000);
				
				/*driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Desktops");
				Thread.sleep(3000);
				
				String url=driver.getCurrentUrl();
				
				System.out.println(url);
				
				driver.findElement(By.cssSelector("button.button-1")).click();
				Thread.sleep(3000);
				
				String Title=driver.getTitle();
				
				System.out.println(Title);*/
				
				driver.findElement(By.cssSelector("input[aria-label='Search store']")).sendKeys("Desktops");
				Thread.sleep(3000);
				
				
				
				driver.close();
	}

}
