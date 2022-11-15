package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@title='Temel ve isteğe bağlı çerezlere izin ver']")
    public WebElement cerezler;

    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "pass")
    public WebElement pass;

    @FindBy(xpath = "//button[@data-testid='royal_login_button']")
    public WebElement girisyap;


    @FindBy(xpath = "//img[@class='_9ay6 img']")
    public WebElement uyariYazisi;

    @FindBy(linkText = "Hesabını bul ve giriş yap.")
    public WebElement yanlisKullaniciAdi;

    @FindBy(className= "_9ay7")
    public WebElement yanlisKyanlissifre;

}
