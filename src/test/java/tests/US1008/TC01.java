package tests.US1008;

import org.testng.annotations.Test;
import pages.RoomReservations;

public class TC01 {

@Test
    public void urlGiris(){

    //Yönetici olarak Anasayfaya sorunsuz giriş yapabilmeliyim
    //Yönetici  sağ üst köşede "Log İn" sayfasını tıklamalıdır
    //Yönetici  username ve password girip "Log in" butonuna basmalıdır
    RoomReservations roomReservations=new RoomReservations();
    roomReservations.girisYap();




}



}
