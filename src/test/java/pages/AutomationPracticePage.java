package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPracticePage {
   public  AutomationPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement registersignin;


    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement emailcreate;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    public WebElement createaccounttusu;

    @FindBy(id= "id_gender1")
    public WebElement cinsiyetbutonu;

    @FindBy(xpath = "//p[@class='info-account']")
   public WebElement wellcome;




}
