Feature: US1003 DBUtil ile istenen degeri test eder


  Scenario: TC03 Kullanici istenen degeri test eder

    Given kullanici DBUtils ile HMC veri tabanina baglanir
    And kullanici DBUtils ile "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici DBUtils ile "Price" sutunundaki verileri okur
    Then  DBUtil ile 4. "Price" in 425 oldugunu test eder