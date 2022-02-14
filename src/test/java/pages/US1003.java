package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US1003 {

    public US1003(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath= "//a[@class='btn-custom']")
    public WebElement newAccountButonu;

    @FindBy(id = "UserName")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='NameSurname']")
    public WebElement fullNameBox;

    @FindBy(xpath = "//input[@id='PhoneNo']")
    public WebElement phoneBox;

    @FindBy(xpath = "//input[@id='SSN']")
    public WebElement ssNumberBox;

    @FindBy(xpath = "//input[@id='DrivingLicense']")
    public WebElement drivingLicenseBox;

    @FindBy(xpath = "//select[@id='IDCountry']")
    public WebElement countryBox;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement adressBox;

    @FindBy(xpath = "//input[@id='WorkingSector']")
    public WebElement workingSectorBox;

    @FindBy(xpath = "//input[@id='BirthDate']")
    public WebElement birthDateBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement saveBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement okBox;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successfully;

    @FindBy(xpath = "//a[@href='/account/logon']")
    public WebElement loginButonu;

}
