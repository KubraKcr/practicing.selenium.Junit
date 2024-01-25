package practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class P01 extends TestBase {
    @Test public void test01() {


//    Test Case 1: Register User
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
     String url = "http://automationexercise.com";
     driver.navigate().to(url);
     String anaSayfaHandle = driver.getWindowHandle();

//3. Verify that home page is visible successfully
     WebElement HomePage = driver.findElement(By.cssSelector("*[class='logo pull-left']"));
     Assert.assertTrue("home page is not visible",
             HomePage.isDisplayed());
//4. Click on 'Signup / Login' button
     WebElement LoginPage = driver.findElement(By.xpath("//a[@*='/login']"));
     LoginPage.click();

//5. Verify 'New User Signup!' is visible
     WebElement NewUserSignupPage = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
     Assert.assertTrue(NewUserSignupPage.isDisplayed());

//6. Enter name and email address
     WebElement name = driver.findElement(By.name("name"));
     name.sendKeys("kubra");
     WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
     email.sendKeys("k.kozzuthrg@gmail.com");
//7. Click 'Signup' button
     driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
     ReusableMethods.bekle(2);
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
     WebElement eai = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
     Assert.assertTrue(eai.isDisplayed());

     driver.manage().getCookies();
//9. Fill details: Title, Name, Email, Password, Date of birth
     Actions actions = new Actions(driver);
     WebElement radioGender = driver.findElement(By.id("id_gender2"));
     actions.moveToElement(radioGender).perform();

     actions.click(radioGender)
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
              .sendKeys(Keys.PAGE_DOWN)
             .sendKeys("12345")
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .sendKeys(Keys.PAGE_DOWN)
             .keyDown(Keys.ENTER)
             .keyUp(Keys.ENTER)
             .keyDown(Keys.ARROW_DOWN)
             .keyUp(Keys.ARROW_DOWN)
             .keyDown(Keys.ARROW_DOWN)
             .keyUp(Keys.ARROW_DOWN)
             .keyDown(Keys.ARROW_DOWN)
             .keyUp(Keys.ARROW_DOWN)
             .keyDown(Keys.ENTER)
             .keyUp(Keys.ENTER)
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .keyDown(Keys.ENTER)
             .keyUp(Keys.ENTER)
             .keyDown(Keys.ARROW_DOWN)
             .keyUp(Keys.ARROW_DOWN)
             .keyDown(Keys.ENTER)
             .keyUp(Keys.ENTER)
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .keyDown(Keys.ENTER)
             .keyUp(Keys.ENTER)
             .sendKeys(Keys.PAGE_DOWN)
             .keyDown(Keys.ARROW_DOWN)
             .keyUp(Keys.ARROW_DOWN)
             .keyDown(Keys.ENTER)
             .keyUp(Keys.ENTER)
             .perform();
     ReusableMethods.bekle(2);
//10. Select checkbox 'Sign up for our newsletter!'
     driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
     driver.switchTo().window(anaSayfaHandle);
//            11. Select checkbox 'Receive special offers from our partners!'
     driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
//            12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
     WebElement firstName = driver.findElement(By.id("first_name"));
     actions.sendKeys(Keys.PAGE_DOWN);
     actions.sendKeys(Keys.PAGE_DOWN);
     actions.sendKeys(Keys.PAGE_DOWN);
     actions.sendKeys(Keys.PAGE_DOWN);
     actions.click(firstName)
             .sendKeys("kubra")
             .keyDown(Keys.TAB)
             .sendKeys(Keys.PAGE_DOWN)
             .keyUp(Keys.TAB)
             .sendKeys("kocur")
             .sendKeys(Keys.PAGE_DOWN)

             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .sendKeys("Cocuristation Inc.")
             .sendKeys(Keys.PAGE_DOWN)
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .sendKeys("Qartal")
             .sendKeys(Keys.PAGE_DOWN)
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .sendKeys("Hurriyet mah")
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .sendKeys("Turkiye")
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .sendKeys("Anatolia")
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .sendKeys("Istanbul")
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .sendKeys("34310")
             .keyDown(Keys.TAB)
             .keyUp(Keys.TAB)
             .sendKeys("5051483610").perform();
//13. Click 'Create Account button'
     WebElement createAccount = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
     createAccount.click();


     ReusableMethods.bekle(2);

//14. Verify that 'ACCOUNT CREATED!' is visible
     WebElement accountCreated = driver.findElement(By.xpath("//b[text()='Account Created!']"));
     Assert.assertTrue(accountCreated.isDisplayed());
     ReusableMethods.bekle(1);
//15. Click 'Continue' button
     driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
////16. Verify that 'Logged in as username' is visible
   WebElement loggedIn = driver.findElement(By.xpath("//*[text()=' Logged in as ']"));
   Assert.assertTrue(loggedIn.isDisplayed());
    ReusableMethods.bekle(2);
//17. Click 'Delete Account' button
    WebElement deleteAcc=driver.findElement(By.xpath(" //*[@class='fa fa-trash-o']"));
    deleteAcc.click();
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    WebElement deletedTextdisply= driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
   Assert.assertTrue(deletedTextdisply.isDisplayed());
    driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

    }}