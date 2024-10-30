package Day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		//driver.get("https://www.simplilearn.com/");
        driver.navigate().to("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@rel='noreferrer'][normalize-space()='Resources']")).click();		
		Set<String> WinIDs=driver.getWindowHandles();
		System.out.println(WinIDs);
		List<String> WinList= new ArrayList(WinIDs);
		String parentId=WinList.get(0);
		String ChildId=WinList.get(1);
		driver.switchTo().window(ChildId);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[normalize-space()='Data Science & Business Analytics']")).click();
		//Thread.sleep(3000);
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@title='Simplilearn for Business']")).click();
		//Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
