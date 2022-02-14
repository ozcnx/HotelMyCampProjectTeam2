package tests.US1008;

import org.testng.annotations.Test;
import pages.RoomReservations;

public class TC03 {
    //Kullanıcılar Anasayfaya sorunsuz erişebilmelidir.
    //Yönetici  sağ üst köşede "Log İn" sayfasını tıklamalıdır
    //Yönetici  username ve password girip "Log in" butonuna basmalıdır
    //Yönetici "Hotel Management" butonunu tıklamalıdır
    // Yönetici olarak "Room Reservation" butonuna tıklamalıdır

    @Test
    public void roomReservation() {
        RoomReservations roomReservations=new RoomReservations();
        roomReservations.girisYap();
        roomReservations.hotelManegementLinki.click();
        roomReservations.RoomReservationLinki.click();

    }
}