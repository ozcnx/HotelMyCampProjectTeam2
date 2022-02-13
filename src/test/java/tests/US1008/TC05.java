package tests.US1008;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.US1008;

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
    public void addRoomReservation() throws InterruptedException {
        US1008 us1008 = new US1008();
        us1008.girisYap();
        us1008.hotelManegementLinki.click();
        us1008.RoomReservationLinki.click();
       us1008.AddRoomReservationLinki.click();


        us1008.manager.click();
        us1008.oda.click();
        us1008.Price.sendKeys("500"+ Keys.TAB);
        us1008.dateStart.sendKeys("02-15-2022"+Keys.TAB);
        Thread.sleep(2000);
        us1008.dateEnd.sendKeys("02-20-2022"+Keys.TAB);
        us1008.adultAmount.sendKeys("2"+Keys.TAB);
        us1008.childrenAmount.sendKeys("2"+Keys.TAB);
        us1008.contactNameSurname.sendKeys("Yılmaz Tarhan"+Keys.TAB);
        us1008.contactPhone.sendKeys("5552502525"+Keys.TAB);
        us1008.contactEmail.sendKeys("yt@gmail.com"+Keys.TAB);
        us1008.notes.sendKeys("Örnek");
        us1008.approved.click();
        us1008.saveButonu.click();







    }
}
