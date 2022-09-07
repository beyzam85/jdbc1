package jdbcPractice;

import java.sql.*;

public class Query02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1) Driver yukle
        Class.forName("org.postgresql.Driver");

        //2) Baglantı olustur
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed",
                "postgres", "Beyza:13");

        // 3) Statement
        Statement st = con.createStatement();

        //4) ResultSet
        ResultSet data= st.executeQuery("select * from ogrenciler where cinsiyet = 'E' ");

                //SORU: Öğrenciler tablosundaki erkek öğrencileri listeleyiniz?

        //5) Sonuclari al
        while (data.next()) {

            //index kullanarak
            //System.out.println(data.getInt(1)+
            //        data.getString(2)+
            //        vdata.getString(3)+
            //        data.getString(4));

            //sutun ismi kuşşnarak
            System.out.println(data.getInt("okul_no") +
                    data.getString("ogrenci_ismi") +
                    data.getString("sinif") +
                    data.getString("cinsiyet"));


        }

            con.close();
            st.close();
            data.close();


    }
}
