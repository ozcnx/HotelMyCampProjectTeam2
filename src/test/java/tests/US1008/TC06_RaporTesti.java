package tests.US1008;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RoomReservations;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC06_RaporTesti extends TestBaseRapor {


    @Test
    public void addRoomReservations() {
        extentTest=extentReports.createTest("HotelMyCamp","Reservatins Giris test edildi");
        RoomReservations roomReservations = new RoomReservations();
        roomReservations.girisYap();
        extentTest.info("HotelMyCamp Sayfasına Gidildi");
        roomReservations.hotelManegementLinki.click();
        extentTest.info("hotel Manegement butonu tıklandı ");
        roomReservations.RoomReservationLinki.click();
        extentTest.info("RoomReservation butonu tıklandı");
        roomReservations.AddRoomReservationLinki.click();
        extentTest.info("AddRoomReservation butonu tıklandı ");



        roomReservations.manager.click();
        roomReservations.oda.click();
        roomReservations.Price.sendKeys("500" + Keys.TAB);
        roomReservations.bekle(2);
        roomReservations.dateStart.sendKeys("02-16-2022" + Keys.TAB);
        roomReservations.bekle(2);
        roomReservations.dateEnd.sendKeys("02-25-2022" + Keys.TAB);
        roomReservations.adultAmount.sendKeys("2" + Keys.TAB);
        roomReservations.childrenAmount.sendKeys("2" + Keys.TAB);
        roomReservations.contactNameSurname.sendKeys("Yılmaz Tarhan" + Keys.TAB);
        roomReservations.contactPhone.sendKeys("5552502525" + Keys.TAB);
        roomReservations.contactEmail.sendKeys("yt@gmail.com" + Keys.TAB);
        roomReservations.notes.sendKeys("Örnek");
        roomReservations.approved.click();
        roomReservations.saveButonu.click();
        roomReservations.bekle(3);
        extentTest.info("Rezervasyon Bilgileri Dolduruldu ");



        Assert.assertTrue(roomReservations.basariliKayitElementi.isDisplayed());
       extentTest.pass("Rezervasyon bilgilerinin kayıt edildigi test edildi");

    //


    }
}
