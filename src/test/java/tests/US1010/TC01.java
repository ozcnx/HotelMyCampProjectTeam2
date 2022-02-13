package tests.US1010;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US1010Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01 {
 US1010Page us1010Page=new US1010Page();
     @Test
    public void girisTest(){

         us1010Page.kullaniciGiris();
         Assert.assertTrue(us1010Page.pageMenuYaziElementi.isDisplayed());
     }


}
