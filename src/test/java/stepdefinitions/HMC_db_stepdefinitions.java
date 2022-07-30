package stepdefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;

public class HMC_db_stepdefinitions {

    String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=hotelmycamp ; user=techproed;password=P2s@rt65";
    String username="techproed";
    String password="P2s@rt65";

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("kullanici HMC veri tabanina baglanir")
    public void kullanici_hmc_veri_tabanina_baglanir() throws SQLException {
        connection= DriverManager.getConnection(url, username, password);
        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String tablo, String field) throws SQLException {

        String query="SELECT "+field+" FROM "+tablo;

        resultSet=statement.executeQuery(query);

    }
    @Given("kullanici {string} sutunundaki verileri okur")
    public void kullanici_sutunundaki_verileri_okur(String field) throws SQLException {

        resultSet.first();
        System.out.println(resultSet.getString("Price"));
        resultSet.next();
        System.out.println(resultSet.getString("Price"));

        System.out.println("==================== Liste =====================");

        resultSet.absolute(0);
        int sira=1;

        while (resultSet.next()){
            System.out.println(sira+". kayit : " + resultSet.getString("Price"));
            sira++;
        }
    }

}
