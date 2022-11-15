@tumu
Feature: US-1001 1Amazon feature
 #class adi gibi dusunebiliriz US userstory usertest


  Scenario: TC-01(testcase) kullanici amazon sayfasinda Nutella aratir
  # burayida test gibi disinebiiriz

  Given kullanici amazon anasayfasinda
  Then kullanici nutella icin arama yapar
  And sonuclarin nutella icerdigini test eder
  And sayfayi kapatir
  # buradaki ifadelerin hepsi string ifade dolayisiyla buraya ne yazilirsa bunun aynisi yazilir
   # birden fazla tag varsa araya virgul konulmaz
  Scenario: TC-02 kullanici amazon sayfasinda Java aratir
    Given  kullanici amazon anasayfasinda
    Then  kullanici java icin arama yapar
    And  sonuclarin java icerdigini test eder
    And sayfayi kapatir

  Scenario: TC-03 kullanici amazon sayfasinda Iphone aratir
    Given  kullanici amazon anasayfasinda
    Then  kullanici Iphone icin arama yapar
    And  sonuclarin Iphone icerdigini test eder
    And sayfayi kapatir