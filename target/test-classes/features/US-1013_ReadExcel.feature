Feature: US-1013 Kullanici Excel bilgilerine ulasabilmeli

  Scenario: TC18 kullanici excel bilgilerini kullanir
  1) Yeni bir class olusturalim

  2) Baskentler Excelini framework’e ekleyelim ve excelle ilgili islemleri yaparak
    Given  kullanici dosyayi kullanilabilir hale getirir
    Then   2.satirdaki 2.hucreyi yazdirir
    Then   Baskenti Jakarta olan ulke ismini yazdiralim
    Then   Ulke sayisinin 190 oldugunu test eder
    And    Fiziki olarak kullanilan satir sayisinin 191 oldugunu test eder