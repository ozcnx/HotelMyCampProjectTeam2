package tests.US1008;

import org.testng.annotations.Test;
import pages.US1008;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01 {

@Test
    public void urlGiris(){

    //Yönetici olarak Anasayfaya sorunsuz giriş yapabilmeliyim
    //Yönetici  sağ üst köşede "Log İn" sayfasını tıklamalıdır
    //Yönetici  username ve password girip "Log in" butonuna basmalıdır

    US1008 us1008=new US1008();
    us1008.girisYap();





}



}
