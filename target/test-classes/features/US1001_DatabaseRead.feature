Feature: US1001 kullanici dogru bilgilerle batabase baglanabilmeli

  @db
  Scenario: TC01 Kullanici databe'deki bilgileri okur

    Given  kullanici HMC veri tabanina baglanir
    And  kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici "Price" sutunundaki verileri okur

