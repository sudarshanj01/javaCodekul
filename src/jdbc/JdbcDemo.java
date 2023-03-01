package jdbc;


import java.sql.*;

import static java.lang.Class.forName;

//registering driver
//connection establishment
//statement creation
//statement execution
public class JdbcDemo {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaa",
                    "root","sudarshan.2001"
                    );

            Statement statement=connection.createStatement();

            ResultSet rs=statement.executeQuery("select * from employee");

            while (rs.next()) {
                System.out.println(rs.getInt("id")+" "+rs.getString("name"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
