Feature: herokuapp delete testi
  Scenario: TC-14
    Given kullanici "herokuappAddRemoveElements" anasayfasinda
    Then Add-Element butonuna basin
    Then Delete butonu gorunur oluncaya kadar bekleyin
    And  Delete butonunun gorunur oldugunu test edin
    Then Delete butonuna basarak butonu silin
    And  Delete butonunun gorunmedigini test edin
    And sayfayi kapatir

