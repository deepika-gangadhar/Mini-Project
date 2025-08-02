package linkedinsearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LinkedInScraper {
    public static void main(String[] args) throws InterruptedException, IOException {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open LinkedIn
        driver.get("https://www.linkedin.com/login");
        driver.manage().window().maximize();

        // Login
        driver.findElement(By.id("username")).sendKeys("your_email");
        driver.findElement(By.id("password")).sendKeys("your_password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000); // wait for login

        // Search for Designers
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Designer");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(5000); // wait for results

        // Collect profile names
        List<WebElement> names = driver.findElements(By.xpath("//span[contains(@class,'entity-result__title-text')]"));

        // Save to CSV
        FileWriter writer = new FileWriter("output.csv");
        writer.append("Name\n");
        for (WebElement name : names) {
            writer.append(name.getText()).append("\n");
        }
        writer.flush();
        writer.close();

        System.out.println("Data saved to output.csv");
        driver.quit();
    }
}
