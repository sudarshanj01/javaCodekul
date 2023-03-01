package jdbc;

import java.sql.*;

public class InsertDemo {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javaa",
                    "root","sudarshan.2001"
            );

            Statement statement=connection.createStatement();

            String insert="insert into employee(id,name) values(3,'ram')";
            String update="update employee set name='jadhav' where id=1 ";
            String delete="DELETE FROM employee WHERE id=3";

            int i=statement.executeUpdate(update);
            System.out.println(i+" rows affected");


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
