package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.Adım:Driver'a kaydol
        Class.forName("org.postgresql.Driver");

        //2. Adım:Database'e bağlan
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed",
                "postgres", "Beyza:13");

        //3. Adim: Statement olustur
       Statement st =  con.createStatement();

       //4. Adım:Query çalıştır.

        //1. örnek:"workers" adinda bir table olusturup "worker_id,worker_name, worker_salary" sütunlarını ekleyin.
        String sql1 = ("CREATE TABLE workers(worker_id VARCHAR(50), worker_name VARCHAR(50), worker_salary INT)");
        boolean result = st.execute(sql1);
         System.out.println(result);// false cıktı cunku data cagrılmadi


        //2.Örnek: Table a worker_address sütunu ekleyerek alter(degişim)yapın
      String sql2 = "ALTER TABLE workers ADD worker_address VARCHAR(80)";
      st.execute(sql2);

        //3.Örnek: Drop workers table düşür
        String sql3 = "DROP TABLE workers";
        st.execute(sql3);

        //5.Adim:Bağlanti ve Statement i kapat.
        con.close();
        st.close();









    }
}
