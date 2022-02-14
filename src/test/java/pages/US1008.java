package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US1008 {
    public  US1008(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziElementi;

    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy(xpath = "//span[text()='System Management']")
    public WebElement SystemManagementLinki;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManegementLinki;

   @FindBy(xpath = "//a[@href='/admin/RoomReservationAdmin']")
   public WebElement RoomReservationLinki;

   @FindBy(xpath = "//span[text()='Add Room Reservation ']")
   public WebElement AddRoomReservationLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeKutusu;

    @FindBy ( xpath="//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement addHotelSaveButonu;

    @FindBy(xpath = "//option[text()='manager']")
    public WebElement manager;

    @FindBy(xpath = "//option[text()='T1']")
    public  WebElement oda;

    @FindBy(xpath = "//input[@id='Price']")
    public WebElement Price;

    @FindBy(xpath = "//input[@id='DateStart']")
    public WebElement dateStart;

    @FindBy(xpath = "//input[@id='DateEnd']")
    public WebElement dateEnd;

    @FindBy(xpath = "//input[@id='AdultAmount']")
    public WebElement adultAmount;

    @FindBy(xpath = "//input[@id='ChildrenAmount']")
    public WebElement childrenAmount;

    @FindBy(xpath = "//input[@id='ContactNameSurname']")
    public WebElement contactNameSurname;

    @FindBy(xpath = "//input[@id='ContactPhone']")
    public WebElement contactPhone;

    @FindBy(xpath = "//input[@id='ContactEmail']")
    public WebElement contactEmail;

    @FindBy(xpath = "//input[@id='Notes']")
    public WebElement notes;

    @FindBy(xpath = "//div[@id='uniform-Approved']")
    public WebElement approved;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButonu;




    public void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void girisYap(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkLoginLinki.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButonu.click();

    }



}

