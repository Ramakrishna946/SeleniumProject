package Day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		boolean Status=driver.findElement(By.xpath("//img[@title='Simplilearn - Online Certification Training Course Provider']")).isDisplayed();
		
		System.out.println("The Webpage logo Status is:" + Status );
		
		String Title= driver.getTitle();
		
		System.out.println("The Title Is:  "+  Title);
		
		String Url= driver.getCurrentUrl();
		System.out.println("The WebPage Url Is:  "+  Url);
		
		/*String Page=driver.getPageSource();
		System.out.println("The WebPage Source Is:  "+   Page);*/
		
		String WindowId=driver.getWindowHandle();
		
		System.out.println("Window Id:  " +   WindowId);
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Resources")).click();
		
		Set<String> Windowids= driver.getWindowHandles();
		
		System.out.println(Windowids);
		
		
		
		driver.close();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
