package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuappSD {

   HerokuappPage ho=new HerokuappPage();

    @Then("Add-Element butonuna basin")
    public void add_element_butonuna_basin() {
   ho.Addelementbutonu.click();

    }

    @Then("Delete butonu gorunur oluncaya kadar bekleyin")
    public void delete_butonu_gorunur_oluncaya_kadar_bekleyin() {
     WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(1));
     wait.until(ExpectedConditions.visibilityOf(ho.Deletebutonu));

    }
    @Then("Delete butonunun gorunur oldugunu test edin")
    public void delete_butonunun_gorunur_oldugunu_test_edin() {

     Assert.assertTrue(ho.Deletebutonu.isDisplayed());
    }

    @Then("Delete butonuna basarak butonu silin")
    public void delete_butonuna_basarak_butonu_silin() {
     ho.Deletebutonu.click();

    }

    @Then("Delete butonunun gorunmedigini test edin")
    public void delete_butonunun_gorunmedigini_test_edin() {

        ho.Addelementbutonu.click();

        Assert.assertFalse(ho.Addelementbutonu.getText().contains("Delete"));

    }


}
