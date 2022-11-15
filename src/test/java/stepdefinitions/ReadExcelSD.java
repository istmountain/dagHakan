package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadExcelSD {


    String dosyaYolu="src/test/resources/ulkeler.xlsx";
    FileInputStream fis =new FileInputStream(dosyaYolu);
    Workbook workbook=WorkbookFactory.create(fis);
    Sheet sheet;

    public ReadExcelSD() throws IOException {
    }

    @Given("kullanici dosyayi kullanilabilir hale getirir")
    public void kullanici_dosyayi_kullanilabilir_hale_getirir()  {
        sheet=workbook.getSheet("Sayfa1");
    }


    @Then("{int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdaki_hucreyi_yazdirir(int satir, int sutun) {
     String  istenenhucre=sheet.getRow(satir-1).getCell(sutun-1).toString();
        System.out.println(istenenhucre);
    }

    @Then("Baskenti Jakarta olan ulke ismini yazdiralim")
    public void baskenti_jakarta_olan_ulke_ismini_yazdiralim() {

        int satirsayisi = workbook.getSheet("Sayfa1").getLastRowNum();
        System.out.println(satirsayisi);

        for (int i = 0; i <= satirsayisi; i++) {
            if(sheet.getRow(i).getCell(1).
                    toString().contains("Jakarta")) {
                System.out.println(workbook.getSheet("Sayfa1").getRow(i).getCell(0));
            }
        }
    }

    @Then("Ulke sayisinin {int} oldugunu test eder")

    public void ulke_sayisinin_oldugunu_test_eder(int beklenenulkesayisi) {

        //  SoftAssert softassert = new SoftAssert(); malesef soft assert yapamiyoruz cunku
        //  Cucumberde test Ng yerine junit kullaniyoruz Cucumber zaten otomotik gecmeyen test adimini atliyor

        int ulkeseyisi =sheet.getLastRowNum();

        Assert.assertEquals(beklenenulkesayisi, ulkeseyisi);



    }

    @Then("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(int ulkeSatirSayisi) {

        int ulkefizikisayi = sheet.getPhysicalNumberOfRows();
        System.out.println(ulkefizikisayi);

        Assert.assertEquals(ulkeSatirSayisi,ulkefizikisayi);

    }

}
