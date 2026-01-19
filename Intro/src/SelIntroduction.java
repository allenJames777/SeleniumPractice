import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration; // Required for Duration.ofSeconds
import org.openqa.selenium.interactions.Actions; //for actions

public class SelIntroduction {

    // Added 'throws InterruptedException' to handle the wait
    public static void main(String[] args) throws InterruptedException {

        // 1. Initialize the Driver FIRST
        WebDriver driver = new ChromeDriver();

        // 2. Define WebDriverWait AFTER driver is created
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.aq.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // --- WAITING FOR 5 SECONDS ---
        System.out.println("Waiting for 5 seconds...");
        Thread.sleep(5000); // Input is in milliseconds (5000ms = 5s)
        

        driver.navigate().to("https://account.aq.com/Login");
        Thread.sleep(2000); // Input is in milliseconds (5000ms = 5s)
        WebElement textField = driver.findElement(By.id("uuu"));
        new Actions(driver)
        .sendKeys(textField, "Hello Selenium!")
        .perform();
    }
}