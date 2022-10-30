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
        if (fb.cerezler.isDisplayed()){ fb.cerezler.click();}}

    @Then("sayfaya giris yapar")
    public void sayfayaGirisYapar() { fb.girisyap.click();}

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


    @And("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
       // Assert.assertTrue(fb.hesabinibulgirisyap.isDisplayed());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Giriş Yap"));
        System.out.println("Title :"+Driver.getDriver().getTitle());

    }






}
