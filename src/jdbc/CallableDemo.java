package jdbc;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Callable;

public class CallableDemo {

    public static void main(String[] args) {

        try {
            CallableStatement callableStatement=Conn.getconnection().prepareCall("call getEmployee()");

            ResultSet rs=callableStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id")+" "+rs.getString("name"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
