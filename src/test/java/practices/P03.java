package practices;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

public class P03 extends TestBase {
    @Test public void test01(){
        driver= new ChromeDriver();

//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com/");
//        3. Verify that home page is visible successfully
        WebElement homePage= driver.findElement(By.xpath("(//div[@class='col-sm-4'])[1]"));
        Assert.assertTrue(homePage.isDisplayed());
//        4. Click on 'Signup / Login' button
        WebElement LoginPage = driver.findElement(By.xpath("//a[@*='/login']"));
        LoginPage.click();
//        5. Verify 'Login to your account' is visible
        WebElement loginPage = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginPage.isDisplayed());
//        6. Enter incorrect email address and password
        WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        email.sendKeys("kubra.k@gmail.com");
        WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys("123123");
//        7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
//        8. Verify error 'Your email or password is incorrect!' is visible
        WebElement incorrectInfo = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
        Assert.assertTrue(incorrectInfo.isDisplayed());



    }


}
