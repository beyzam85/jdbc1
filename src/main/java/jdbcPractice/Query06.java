package jdbcPractice;

import static jdbcPractice.DatabaseUtilty.*;

public class Query06 {
    public static void main(String[] args) {

        createConnection();

        String query = "select * from ogrenciler";
        System.out.println("Sutun Isimleri" + getColumnNames(query));

        System.out.println("oku No: " + getColumnData(query, "okul_no"));
        System.out.println("ögrenci No: " + getColumnData(query, "ögrenci_no"));
        System.out.println("Sinif: " + getColumnData(query, "sinif"));
        System.out.println("Cinsiyet: " + getColumnData(query, "cinsiyet"));
    }
}
