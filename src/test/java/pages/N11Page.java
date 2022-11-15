package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class N11Page {
    public N11Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//span[.='Tümünü Reddet']") public WebElement cerezler;
@FindBy(xpath = "//html/body/iframe[7]") public WebElement iframe;
@FindBy(xpath = "(//button[.='Daha Sonra'])[1]") public WebElement uyariIptal;
@FindBy(linkText= "Site Haritası") public WebElement siteharitasi;
@FindBy(linkText= "Mağazalar") public WebElement Magazalar;
@FindBy(xpath= "//*[@id=\"contentSellerList\"]/div/div[2]/div/div[2]/div[4]/div[2]/span/i")public WebElement A_harfi;
@FindBy(xpath= " //*[@id=\"contentSellerList\"]/div/div[2]/div/div[2]/div[4]/div[2]/ul/li")public List<WebElement> A_Ile_Baslayan_Magazalar;
@FindBy(id= "searchData") public WebElement arama_motoru;
@FindBy(xpath= "//span[@class='selectedText']") public WebElement akilliSiralama;
@FindBy(xpath= "//div[2]/div/div[2]/div[5]") public WebElement yorumsayisi;
@FindBy(xpath = "//*[@id=\"listingUl\"]/li") public List<WebElement>kulaklik_listesi;
@FindBy(xpath = "//*[@id=\"freeShipmentOption\"]/span") public WebElement ucretsizKargo;
@FindBy(xpath = "//*[@id=\"p-127483852\"]/div/span") public WebElement birinci_urun;
@FindBy(xpath = "//*[@id=\"p-201135008\"]/div/span") public WebElement ikinci_urun;
@FindBy(xpath= "//*[@id=\"header\"]/div/div/div/div[2]/div[3]/div/div/div[2]/a") public WebElement sepetegit;


}
