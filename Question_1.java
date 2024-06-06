package task_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Question_1 {

    //Declaring Driver Variable as Global to Access Throughout the Class
    WebDriver driver;

    @BeforeTest
    //Function to Start the Chrome Browser
    public void launchChrome(){

        //Creating an Instance for ChromeDriver
        driver = new ChromeDriver();

        //Maximizing the Window
        driver.manage().window().maximize();

        //Navigating to the Given URL
        driver.get("https://phptravels.com/demo/");
    }

    @Test
    //Function to Insert the Text
    public void phpTravels(){

        //Creating an Instance for Wait and Declaring 10 Seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Declaring the Expected Conditions Using WebElement to Wait Untill the Page Opens
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo")));

        //Inserting the Data in FirstName Field
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Sample");

        //Inserting the Data in LastName Field
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Demo");

        //Inserting the Data in BusinessName Field
        driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("Business Analyst");

        //Inserting the Data in Email Field
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sampledemo123@gmail.com");

        //Getting the Text From the Particular WebElement
        String sx = driver.findElement(By.id("numb1")).getText();

        //Converting the Data from String to Integer
        int x = Integer.parseInt(sx);

        //Getting the Text From the Particular WebElement
        String sy = driver.findElement(By.id("numb2")).getText();

        //Converting the Data from String to Integer
        int y = Integer.parseInt(sy);

        //Adding the Both Integer
        int z = x + y ;

        //Converting the Data from Integer to String
        String sz = Integer.toString(z);

        //Inserting the Converted Data in Respective Field
        driver.findElement(By.id("number")).sendKeys(sz);

        //Clicking on "Submit" Button
        driver.findElement(By.id("demo")).click();
    }
}
