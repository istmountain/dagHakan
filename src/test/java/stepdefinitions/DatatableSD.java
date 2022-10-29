package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DatatablePage;
import utilities.Driver;

public class DatatableSD {
    DatatablePage dt=new DatatablePage();
    Actions actions = new Actions(Driver.getDriver());
      @When("new butonuna basar")
    public void new_butonuna_basar() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
       Thread.sleep(3000);
        dt.newButonu.click();

    }
    @Then("kullanici firstname {string} girer")
    public void kullanici_firstname_girer(String firstName) {
     dt.firstNameKutusu.sendKeys(firstName);
    }

    @Then("kullanici lastname {string} girer")
    public void kullanici_lastname_girer(String lastName) {
       dt.lastNameKutusu.sendKeys(lastName);
    }

    @Then("kullanici pozisyon {string} girer")
    public void kullanici_pozisyon_girer(String position) {
        dt.positionKutusu.sendKeys(position);
    }

    @Then("kullanici ofis adresini {string} girer")
    public void kullanici_ofis_adresini_girer(String office) {
        dt.officeKutusu.sendKeys(office);
    }

    @Then("kullanici extension alanina {string} girer")
    public void kullanici_extension_alanina_girer(String extension) {
        dt.extentionKutusu.sendKeys(extension);
    }

    @Then("kullanici startdate {string} girer")
    public void kullanici_startdate_girer(String startDate) {
        dt.startDate.sendKeys(startDate);
    }

    @Then("kullanici maas {string} girer")
    public void kullanici_maas_girer(String salary) {
        dt.salaryKutusu.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dt.createButonu.click();
    }

    @Then("kullanici ilk isim  {string} ile arama yapar")
    public void kullaniciIlkIsimIleAramaYapar(String firstName) {
     dt.search.sendKeys(firstName);

    }

    @And("isim bolumunde firstname {string} oldugunu dogrular")
    public void isimBolumundeFirstnameOldugunuDogrular(String firstName) {

        Assert.assertTrue(dt.aramasonucilkelement.getText().contains(firstName));
    }

}
