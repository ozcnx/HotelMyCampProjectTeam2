package tests.US1008;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RoomReservations;
import utilities.Driver;

public class TC05 {
    //Kullanıcılar Anasayfaya sorunsuz erişebilmelidir
    //Yönetici  sağ üst köşede "Log İn" sayfasını tıklamalıdır
    //Yönetici  username ve password girip "Log in" butonuna basmalıdır
    //Yönetici "Sistem Management" butonuna tıklamalıdır
    //Yönetici "Hotel Management" butonunu tıklamalıdır
    //Yönetici olarak "Room Reservation" butonuna tıklamalıdır
    //Yönetici olarak  sağ üst köşedeki  "+ADD ROOM RESERVATİON"butonuna tıklamalıdır
    //Yönetici açılan sayfada zorunlu olan bütün aşamaları doldurulup "SAVE" Butonunu tıklamalıdır
    //Yönetici  Room Reservationu yapabildiğini doğrulamalıdır

    @Test
    public void addRoomReservations()  {
        RoomReservations roomReservations=new RoomReservations();
        roomReservations.girisYap();
        roomReservations.hotelManegementLinki.click();
        roomReservations.RoomReservationLinki.click();
        roomReservations.AddRoomReservationLinki.click();


        roomReservations.manager.click();
        roomReservations.oda.click();
        roomReservations.Price.sendKeys("500"+ Keys.TAB);
        roomReservations.bekle(2);
        roomReservations.dateStart.sendKeys("02-18-2022"+Keys.TAB);
        roomReservations.bekle(2);
        roomReservations.dateEnd.sendKeys("02-25-2022"+Keys.TAB);
        roomReservations.adultAmount.sendKeys("2"+Keys.TAB);
        roomReservations.childrenAmount.sendKeys("2"+Keys.TAB);
        roomReservations.contactNameSurname.sendKeys("Yılmaz Tarhan"+Keys.TAB);
        roomReservations.contactPhone.sendKeys("5552502525"+Keys.TAB);
        roomReservations.contactEmail.sendKeys("yt@gmail.com"+Keys.TAB);
        roomReservations.notes.sendKeys("Örnek");
        roomReservations.approved.click();
        roomReservations.saveButonu.click();
        roomReservations.bekle(3);


       Assert.assertTrue(roomReservations.basariliKayitElementi.isDisplayed());




    }
}
