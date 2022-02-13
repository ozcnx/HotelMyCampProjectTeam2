package tests.US1010;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US1010Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC03 {
    US1010Page us1010Page=new US1010Page();
    @Test
    public void rezervasyonTablosuFormu(){
        us1010Page.kullaniciGiris();
        us1010Page.roomsButtonElementi.click();
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();

        us1010Page.rezervasyonGirisTarihiTextBox.clear();
       us1010Page.rezervasyonGirisTarihiTextBox.sendKeys(ConfigReader.getProperty("HMCUserRezGirisTarihi"));
       us1010Page.rezervasyonCikisTarihiTextBox.clear();
       us1010Page.rezervasyonCikisTarihiTextBox.sendKeys(ConfigReader.getProperty("HMCUserRezcikisTarihi"));
        Select select=new Select(us1010Page.selectRoomTypeTextBox);
       select.selectByVisibleText("Single");
      Select select1= new Select(us1010Page.selectAdultCountTextBox);
      select1.selectByVisibleText("1 Adult");
      us1010Page.searchButonuElementi.click();
        System.out.println(us1010Page.aramaSonrasiRoomsListe);
        Assert.assertFalse(us1010Page.aramaSonrasiRoomsListe.isEmpty());
    }



}
