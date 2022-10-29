package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatatablePage {
    public DatatablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath ="//*[@id=\"example_wrapper\"]/div[1]/button[1]")
    public WebElement newButonu;


    @FindBy(xpath ="//input[@id='DTE_Field_first_name']")
    public WebElement firstNameKutusu;


    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastNameKutusu;


    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement positionKutusu;


    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeKutusu;


    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extentionKutusu;


    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDate;


    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salaryKutusu;


    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButonu;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement search;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement aramasonucilkelement;


}
