package tests.US1003;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.US1003;
import utilities.ConfigReader;
import utilities.Driver;

public class TC04 {
    static WebDriver driver;
    @Test
    public void test04() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        Actions actions=new Actions(Driver.getDriver());
        US1003 us1003=new US1003();
        Faker faker=new Faker();
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();


        us1003.ilkLoginLinki.click();
        hotelMyCampPage.bekle(1);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMyCampPage.bekle(1);

        us1003.newAccountButonu.click();

        actions.click(us1003.usernameBox)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys("Merve1234!")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys("5551112233")
                .sendKeys(Keys.TAB)
                .sendKeys("111223333")
                .sendKeys(Keys.PAGE_DOWN).perform();
        hotelMyCampPage.bekle(1);
        actions.sendKeys(Keys.TAB)
                .sendKeys("B").sendKeys(Keys.TAB)
                .sendKeys("Turkey")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("İstanbul")
                .sendKeys(Keys.TAB)
                .sendKeys("Öğrenci")
                .sendKeys(Keys.TAB)
                .sendKeys("1/1/2000")
                .sendKeys(Keys.TAB)
                .click(us1003.saveBox).perform();
        hotelMyCampPage.bekle(2);

        String expectedSuccessfully="User Data was inserted successfully";
        String actualSuccessfully=us1003.successfully.getText();

        Assert.assertEquals(actualSuccessfully, expectedSuccessfully);

        hotelMyCampPage.bekle(1);

        us1003.okBox.click();
        hotelMyCampPage.bekle(1);

        //driver.navigate().refresh();

        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        hotelMyCampPage.bekle(1);
        us1003.loginButonu.click();

    }
}
