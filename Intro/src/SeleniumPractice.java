import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPractice {
	

	public static void main(String[] args) {
		
		//Initiate the chrome driver first 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("HelloWorld");
//		driver.findElement(By.id("inputUsername")).sendKeys("HelloWorld");
		
//Web element is used for finding element
//        WebElement textField = driver.findElement(By.name("inputPassword"));
//        new Actions(driver)
//        .sendKeys(textField, "Hello Selenium!")
//        .perform();
		
		driver.findElement(By.name("inputPassword")).sendKeys("123");
		driver.findElement(By.id("chkboxOne")).click();
		
       driver.findElement(By.className("signInBtn")).click();
       
     
       
       //The reason this caused an error because of timeout issue
       //implicit wait - will tell atleast to wait x seconds
       timeout(driver);
       //CSS selector- this is used if there is no id/className of the HTML 
       // The following can be used for CSS selector 
       // tagname.classname, tagname.id, tagname=[attribute = 'value'], tagname[placeholder =' value']
       System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //web console for checking if there are any duplicates = $('p.error');
       
       //By.LinkText - if someone has an anchor tag
       driver.findElement(By.linkText("Forgot your password?")).click();
       //using xPath
       driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Allen");
       

	}
	//In professional automation frameworks, we usually avoid 
	//static variables because they make parallel testing difficult later on. Instead, we "pass" the driver to the method.
	public static void timeout(WebDriver driver ) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
