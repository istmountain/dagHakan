

Feature: US-1005 kullanici dogru email adresi ve sifre ile giris yapabilmeli
  Scenario: TC-08 pozitif login test (dogru email adresi dogru sifre)

    Given kullanici "facebookUrl" anasayfasinda
    When  kullanici 2 saniye bekler
    Then  varsa cerezleri kabul eder
    Then  gecerli "hakandag_@hotmail.com"  email adresini girer
    And   gecerli "150400Hd" sifre girer
    Then  sayfaya giris yapar
    And  kullanici 3 saniye bekler


