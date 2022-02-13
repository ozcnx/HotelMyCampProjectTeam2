package pages;

import org.checkerframework.common.returnsreceiver.qual.This;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US1010Page {

    public US1010Page(){
        PageFactory.initElements(Driver.getDriver() , this);
    }


    public void bekle(int saniye){
        try {
            Thread.sleep(saniye*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
@FindBy (xpath = "//a[text()='Log in']")
    public WebElement anaSayfaLoginbutonu;

    @FindBy (id = "UserName")
    public WebElement userNameTextBox;

    @FindBy (id = "Password")
    public WebElement userPasswordTextBox;

    @FindBy (id = "btnSubmit")
    public WebElement girisLoginButon;

    @FindBy (xpath = "//h2[text()='Profile Page']")
    public WebElement pageMenuYaziElementi;

    public void kullaniciGiris(){
        US1010Page us1010Page=new US1010Page();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        us1010Page.anaSayfaLoginbutonu.click();
        us1010Page.userNameTextBox.sendKeys(ConfigReader.getProperty("HMCUserUsername"));
        us1010Page.userPasswordTextBox.sendKeys(ConfigReader.getProperty("HMCUserPassword"));
        us1010Page.girisLoginButon.click();

    }



    @FindBy(xpath = "(//a[text()='Rooms'])[1]")
    public WebElement roomsButtonElementi;

   @FindBy (xpath ="//h1[text()='Rooms']")
   public WebElement roomsSayfasibaslikyazisi;

    @FindBy (id = "checkin_date")
    public WebElement rezervasyonGirisTarihiTextBox;

    @FindBy (id = "checkout_date")
    public WebElement rezervasyonCikisTarihiTextBox;

    @FindBy (id = "IDRoomType")
    public WebElement selectRoomTypeTextBox;
    @FindBy (id="AdultCount")
    public WebElement selectAdultCountTextBox;

    @FindBy (xpath="//input[@value='Search']")
    public WebElement searchButonuElementi;

    @FindBy (xpath="//div[@class='col-sm col-md-6 col-lg-4 ftco-animate fadeInUp ftco-animated']")
    public List<WebElement> aramaSonrasiRoomsListe;



}
