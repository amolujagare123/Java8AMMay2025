package JDBCDemo;

import java.sql.*;

public class JDBCDemo2 {

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

        // 4. executing query // DDL - select / create table
        String sql = "select * from candidate";
        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno") + "\t");
            System.out.print(rs.getString("name")+ "\t");
            System.out.print(rs.getString("department")+ "\t");
            System.out.println(rs.getInt("marks"));
        }
    }
}
