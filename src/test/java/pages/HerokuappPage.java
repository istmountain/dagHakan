package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuappPage {

        public   HerokuappPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "//button[.='Add Element']")
        public WebElement Addelementbutonu;

        @FindBy(xpath = "//button[@onclick='addElement()']")
        public WebElement AddRemoveButonu;

        @FindBy(xpath = "//button[@class='added-manually']")
        public WebElement Deletebutonu;

        @FindBy(xpath = "//button[@onclick='addElement()']")
        public List<WebElement> Deletelistesi;

    }


