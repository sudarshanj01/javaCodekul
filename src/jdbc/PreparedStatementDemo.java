package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo  {
        public static void main(String[] args) {
         try {



        Scanner sc= new Scanner(System.in);
        int id;
        String name;
        System.out.println("Enter id and name");
        id=sc.nextInt();
        name=sc.next();

        String insert="insert into employee(id,name) values(?,?)";
        String update="update employee set name=? where id=? ";

        PreparedStatement preparedStatement=Conn.getconnection().prepareStatement(update);

        preparedStatement.setInt(2,id);
        preparedStatement.setString(1,name);

        int i=preparedStatement.executeUpdate();


    } catch (ClassNotFoundException | SQLException e) {
        throw new RuntimeException(e);
    }

}
}

