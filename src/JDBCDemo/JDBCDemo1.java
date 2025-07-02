package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection
        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/7ambatch";

        Connection con = DriverManager.getConnection(url,user,pass);

        // 3. create statement
        Statement st = con.createStatement();

        // 4. executing query // DML - Insert / update / delete
        String sql = "insert into candidate values(13,'amol','IT',45)";
        st.executeUpdate(sql);
    }
}
