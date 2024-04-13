package selepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsinselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.findElement(By.id("email")).sendKeys("selenium");
		//driver.findElement(By.name("pass")).sendKeys("pass");
		//driver.findElement(By.cssSelector("#email")).sendKeys("selenium");
		//driver.findElement(By.cssSelector("._8esh")).click();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.className("_8esh")).click();
		//driver.findElement(By.partialLinkText("password?")).click();
		/*Locators in selenium
		 * ID
		 * classname
		 * name
		 * linktext
		 * partial link text
		 * xpath
		 * css selector
		 * tagname
		 * css selector----->Cascade style sheet selector
		 * css selector------>font-size,colour
		 * css selector------->id #, classname=.
		 * 
		 * 
		 */
List<WebElement>ele=driver.findElements(By.tagName("a"));
int s1=ele.size();
System.out.println(s1);
for(WebElement temp:ele)
{
	System.out.println(temp.getText());
}
		
		}

}
