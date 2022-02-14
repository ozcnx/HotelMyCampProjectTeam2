package tests.US1008;

import org.testng.annotations.Test;
import pages.RoomReservations;
import utilities.Driver;

public class TC04 {
    //Kullanıcılar Anasayfaya sorunsuz erişebilmelidir
    //Yönetici  sağ üst köşede "Log İn" sayfasını tıklamalıdır
    //Yönetici  username ve password girip "Log in" butonuna basmalıdır
    //Yönetici "Hotel Management" butonunu tıklamalıdır
    //Yönetici olarak "Room Reservation" butonuna tıklamalıdır
    //Yönetici olarak  sağ üst köşedeki  "+ADD ROOM RESERVATİON"butonuna tıklamalıdır

    @Test
    public void addRoomReservation() {
        RoomReservations roomReservations=new RoomReservations();
        roomReservations.girisYap();
        roomReservations.hotelManegementLinki.click();
        roomReservations.RoomReservationLinki.click();
        roomReservations.AddRoomReservationLinki.click();
        Driver.closeDriver();



    }
}