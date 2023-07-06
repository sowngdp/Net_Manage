import java.io.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class testConnectionSql {
    //Ghi vào DB

    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;encrypt=true;database=NETCAFE;trustServerCertificate=true;";
            String username = "sa";
            String pass = "123";
            conn = DriverManager.getConnection(url, username, pass);
            System.out.println("Kết nối thành công");


        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
