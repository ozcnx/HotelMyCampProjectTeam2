package tests.US1008;

import org.testng.annotations.Test;
import pages.US1008;

public class TC03 {
    //Kullanıcılar Anasayfaya sorunsuz erişebilmelidir.
    //Yönetici  sağ üst köşede "Log İn" sayfasını tıklamalıdır
    //Yönetici  username ve password girip "Log in" butonuna basmalıdır
    //Yönetici "Hotel Management" butonunu tıklamalıdır
    // Yönetici olarak "Room Reservation" butonuna tıklamalıdır

    @Test
    public void roomReservation() {
        US1008 us1008 = new US1008();
        us1008.girisYap();
        us1008.hotelManegementLinki.click();
        us1008.RoomReservationLinki.click();

    }
}