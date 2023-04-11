package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {

    static String browser = "Edge";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name.");
        }
        //open url in browser
        driver.get(baseUrl);
        //maximise browser
        driver.manage().window().maximize();
        //We give Implicit weight to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //URL
        driver.getCurrentUrl();
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //page
        System.out.println("Page source " + driver.getPageSource());
        //print url
        System.out.println("Current URL :" + driver.getCurrentUrl());
        //print page source
        System.out.println("Page Source : " + driver.getPageSource());
        //Find username field and enter username
        driver.findElement(By.name("username")).sendKeys("NiksSen");
        //find password field element and enter
        driver.findElement(By.name("password"));

        //close browser
        driver.close();
    }
}



