Feature: US-1005 kullanici yanlis kullanici adi ve yanlis sifre ile giris yapamamali


  Scenario: TC-09 negatif login test (gecerli email adresi gecersiz sifre girilecek)

    Given kullanici "facebookUrl" anasayfasinda
    When  kullanici 2 saniye bekler
    Then  varsa cerezleri kabul eder
    Then  gecersiz email "hakandag_@gmail.com"  adresi girer
    And   gecersiz "150" sifre girer
    Then  sayfaya giris yapar
    And   sayfaya giris yapilamadigini test eder
    And   kullanici 3 saniye bekler

  Scenario: TC-10 Yanlis email adresi  ile giris yapilamaz (gecersiz email adresi girecek gecerli sifre girilecek)

    Given kullanici "facebookUrl" anasayfasinda
    When  kullanici 2 saniye bekler
    Then  varsa cerezleri kabul eder
    Then  gecerli "h"  email adresini girer
    And   gecerli "150400Hd" sifre girer
    Then  sayfaya giris yapar
    And  kullanici 3 saniye bekler

  Scenario:TC-11 Dogru email adresi yanlis sifre ile giris yapilamaz(gecerlisiz email adresi gecersiz sifre girilecek)

    Given kullanici "facebookUrl" anasayfasinda
    When  kullanici 2 saniye bekler
    Then  varsa cerezleri kabul eder
    Then  gecerli "h"  email adresini girer
    And   gecerli "12345" sifre girer
    Then  sayfaya giris yapar
    And  kullanici 3 saniye bekler


