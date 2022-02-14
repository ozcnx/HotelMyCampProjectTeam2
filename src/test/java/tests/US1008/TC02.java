package tests.US1008;

import org.testng.annotations.Test;
import pages.RoomReservations;
import utilities.Driver;

public class TC02 {
    //"Kullanıcılar Anasayfaya sorunsuz erişebilmelidir.
    //Yönetici  sağ üst köşede "Log İn" sayfasını tıklamalıdır
    //Yönetici  username ve password girip "Log in" butonuna basmalıdır
    //Yönetici "Hotel Management" butonunu tıklamalıdır

    @Test
    public void HotelManagement(){
        RoomReservations roomReservations=new RoomReservations();
        roomReservations.girisYap();
        roomReservations.hotelManegementLinki.click();
        Driver.closeDriver();
//deneme

    }
}
