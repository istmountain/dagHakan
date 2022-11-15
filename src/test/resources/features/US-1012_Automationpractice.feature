Feature: US-1012  kullanici register yapabilmeli

  Scenario: TC-17 register olmali

    Given kullanici "automationpracticeUrl" anasayfasinda
    And   kullanici  sign in linkine tiklar
    And   kullanici create an account bolumune email adresi girer
    And   create an account bolumunu tiklar
    And   kullanici 3 saniye bekler
    And   kullanici kisisel bilgilerini ve iletisim bilgilerini girer
    And   kullanici 5 saniye bekler
    Then  Yeni bir hesap olusturdugunu dogrular