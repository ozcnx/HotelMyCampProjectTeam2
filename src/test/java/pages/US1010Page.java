package pages;

import org.checkerframework.common.returnsreceiver.qual.This;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

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





}
