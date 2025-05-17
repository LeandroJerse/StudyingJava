package src.main.java.org.example;

import src.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class updateQuery {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = DB.getConnection();
            statement = connection.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary +"+
                    " ? WHERE DepartmentId = ?");

            statement.setDouble(1, 200.00);
            statement.setInt(2,2);
            int rowsAffected = statement.executeUpdate();

            System.out.println("Rows affected: " + rowsAffected + "rows");
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
        finally {
            DB.closeConnection();
        }
    }
}
