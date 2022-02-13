package tests.US1008;

import org.testng.annotations.Test;
import pages.US1008;

public class TC02 {
    //"Kullanıcılar Anasayfaya sorunsuz erişebilmelidir.
    //Yönetici  sağ üst köşede "Log İn" sayfasını tıklamalıdır
    //Yönetici  username ve password girip "Log in" butonuna basmalıdır
    //Yönetici "Hotel Management" butonunu tıklamalıdır

    @Test
    public void HotelManagement(){
        US1008 us1008=new US1008();
        us1008.girisYap();
        us1008.hotelManegementLinki.click();



    }
}
