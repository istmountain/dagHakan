package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.FacebookPage;
import utilities.Driver;

public class FacebookSD {
          FacebookPage fb=new FacebookPage();
          Actions actions = new Actions(Driver.getDriver());
    @Then("varsa cerezleri kabul eder")
    public void varsa_cerezleri_kabul_eder() {
        if (fb.cerezler.isDisplayed()){
         fb.cerezler.click();
        }
    }




    @Then("sayfaya giris yapar")
    public void sayfayaGirisYapar() { fb.girisyap.click();}



    @And("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(fb.hesabinibulgirisyap.isDisplayed()); }

    @Then("gecersiz email {string}  adresi girer")
    public void gecersizEmailAdresiGirer(String gecersizEmailAdres) {
     actions.click(fb.email).sendKeys(gecersizEmailAdres).perform();
       // fb.email.sendKeys(gecersizEmailAdres);
    }

    @And("gecersiz {string} sifre girer")
    public void gecersizSifreGirer(String yanlisSifre) {
        actions.click(fb.pass).sendKeys(yanlisSifre).perform();
        // fb.pass.sendKeys(yanlisSifre);
    }

    @Then("gecerli {string}  email adresini girer")
    public void gecerliEmailAdresiniGirer(String gecerliEmailAdresi) {
        fb.email.sendKeys(gecerliEmailAdresi);
    }

    @And("gecerli {string} sifre girer")
    public void gecerliSifreGirer(String gecerliSifre) {
        fb.pass.sendKeys(gecerliSifre);
    }
}
