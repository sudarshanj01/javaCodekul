package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDemo {
    public static void main(String[] args) {
        try {

            String insert = "insert into employee(id,name) values(?,?)";
            PreparedStatement preparedStatement = Conn.getconnection().prepareStatement(insert);


            for (int i = 1; i <= 10; i++) {
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, "name" + i);
                preparedStatement.addBatch();
            }


           int[] i= preparedStatement.executeBatch();
            System.out.println(i.length + " rows affectes");



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
