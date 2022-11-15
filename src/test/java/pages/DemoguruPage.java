package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoguruPage {

        public DemoguruPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }


        @FindBy(xpath = "//thead//tr//th")
        public List<WebElement> basliklistesi;


        @FindBy(xpath = "(//span[.='Tümünü Kabul Et'])[2]")
        public WebElement cerezler;

        @FindBy(xpath = "//*[@id=\"gdpr-consent-notice\"]")
         public WebElement iframe;

        @FindBy(xpath = "//thead/tr/th")
         public List<WebElement>baslik;

        @FindBy(xpath = "((//tbody[1])[2]/tr/td")
        public List<WebElement> tumListe;

         @FindBy(xpath = "(//tbody[1])[2]/tr/td[1]")
         public List<WebElement> sutun;





}

