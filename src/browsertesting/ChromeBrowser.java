package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

/**
 * Project-2 - Project Name: com-orangehrmlive
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 */
public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com";
        //Launch Edge
        WebDriver driver = new EdgeDriver();
        //Open URL
        driver.get(baseUrl);
        //maximise
        driver.manage().window().maximize();
        //implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title
        String title = driver.getTitle();
        //print title
        System.out.println(title);
        //get url
        driver.getCurrentUrl();
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
