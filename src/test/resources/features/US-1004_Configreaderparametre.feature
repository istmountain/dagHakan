Feature: US-1004 kullanici configuration.properties den parametre kullanarak url degistirebilmeli

  Scenario: TC-07 configuration.properties dosyasindan parametre kullanimi

    Given   kullanici "blueRentalCarsUrl" anasayfasinda
    Then    kullanici 2 saniye bekler
    And     url nin "blue" icerdigini test eder
    Then    kullanici 2 saniye bekler
    And     sayfayi kapatir