package practices;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

public class P2 extends TestBase {
    WebDriver driver1;
    @Test
    public void test (){
 driver= new ChromeDriver();

//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
      driver.get("http://automationexercise.com");
//3. Verify that home page is visible successfully
        WebElement homePage= driver.findElement(By.xpath("(//div[@class='col-sm-4'])[1]"));
        Assert.assertTrue(homePage.isDisplayed());
//4. Click on 'Signup / Login' button
        WebElement LoginPage = driver.findElement(By.xpath("//a[@*='/login']"));
        LoginPage.click();
//5. Verify 'Login to your account' is visible
        WebElement loginPage = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginPage.isDisplayed());
//6. Enter correct email address and password
        WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        email.sendKeys("k.kur@gmail.com");
        WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys("12345");
//7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
//8. Verify that 'Logged in as username' is visible
        WebElement loggedIn = driver.findElement(By.xpath("//*[text()=' Logged in as ']"));
        Assert.assertTrue(loggedIn.isDisplayed());
//9. Click 'Delete Account' button
        WebElement deleteAcc=driver.findElement(By.xpath(" //*[@class='fa fa-trash-o']"));
        deleteAcc.click();
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        WebElement deletedTextdisply= driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
        Assert.assertTrue(deletedTextdisply.isDisplayed());
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
    }
}
