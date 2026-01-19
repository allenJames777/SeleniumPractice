import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		// Corrected syntax: No extra quotes inside, double backslashes used correctly.
		
		
		
		//manual way of defying the webdriver in selenium
	    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		//the selenium manager is much better to use
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aq.com/");
		System.out.println(driver.getTitle()); //get title
		System.out.println(driver.getCurrentUrl()); //geturl
	    driver.navigate().to("https://account.aq.com/Login");
	}

}