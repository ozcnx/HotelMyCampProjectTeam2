package tests.US1010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US1010Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC02 {
    US1010Page us1010Page=new US1010Page();
    @Test
    public void roomsSayfaTesti(){

        us1010Page.kullaniciGiris();
        us1010Page.roomsButtonElementi.click();
        Assert.assertEquals(us1010Page.roomsSayfasibaslikyazisi.getText(),ConfigReader.getProperty("HMCUserRoomsExpectText"));
    }



}
