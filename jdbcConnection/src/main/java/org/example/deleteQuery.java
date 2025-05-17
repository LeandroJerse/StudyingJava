package src.main.java.org.example;

import src.db.DB;
import src.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteQuery {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = DB.getConnection();
            statement = connection.prepareStatement("DELETE FROM department WHERE id = ?");
            statement.setInt(1, 5);
            int rowsAffected = statement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected + "rows");
        }
        catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }

    }
}
