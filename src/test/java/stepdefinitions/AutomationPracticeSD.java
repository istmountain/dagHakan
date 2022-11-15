package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPracticePage;
import utilities.Driver;

public class AutomationPracticeSD {
    Faker faker=new Faker();
    AutomationPracticePage ap=new AutomationPracticePage();
    Actions action=new Actions(Driver.getDriver());
    @Given("kullanici  sign in linkine tiklar")
    public void kullanici_sign_in_linkine_tiklar() {
        ap.registersignin.click();

    }
    @Given("kullanici create an account bolumune email adresi girer")
    public void kullanici_create_an_account_bolumune_email_adresi_girer() {

       ap.emailcreate.sendKeys(faker.internet().emailAddress());
    }
    @Given("create an account bolumunu tiklar")
    public void create_an_account_bolumunu_tiklar() {
    ap.createaccounttusu.click();

    }

    @Given("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullanici_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

     action.click(ap.cinsiyetbutonu).sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
      .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.internet().password())
      .sendKeys(Keys.TAB). sendKeys("1").sendKeys(Keys.TAB).sendKeys("June").sendKeys(Keys.TAB).sendKeys("1950")
      .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
      sendKeys(faker.company().name()).sendKeys(Keys.TAB).sendKeys(faker.address().streetName()).sendKeys(Keys.TAB).
      sendKeys(faker.address().buildingNumber()).sendKeys(Keys.TAB).sendKeys("New York").sendKeys(Keys.TAB).
             sendKeys("New York").sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB).
             sendKeys(Keys.TAB).sendKeys(".........").sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).
             sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).sendKeys(Keys.DELETE).
             sendKeys("..........").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

    }

    @Then("Yeni bir hesap olusturdugunu dogrular")
    public void yeni_bir_hesap_olusturdugunu_dogrular() {
        Assert.assertTrue(ap.wellcome.getText().contains("Welcome to your account." +
                " Here you can manage all of your personal information and orders."));


    }

}
