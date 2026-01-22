import org.openqa.selenium.By;
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
       driver.findElement(By.className("signInBtn")).click();
        
        	
        	

	}

}
