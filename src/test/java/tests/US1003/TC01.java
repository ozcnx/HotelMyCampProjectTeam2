package tests.US1003;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.US1003;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01 {

    Actions actions=new Actions(Driver.getDriver());
    US1003 us1003=new US1003();
    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
    Faker faker=new Faker();

    @BeforeMethod
    public void beforeMethod(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    }

    @Test
    public void test01() throws InterruptedException {

    }

    @Test
    public void test02() throws InterruptedException {

    }

    @Test
    public void test03(){

    }

    @Test
    public void test04(){

    }

}
