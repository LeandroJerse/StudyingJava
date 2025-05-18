package src.main.java.org.example;

import src.db.DB;
import src.db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class transactionQuery {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try{
            connection = new DB().getConnection();
            //não confirma  automaticamente
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            int rows1 =statement.executeUpdate("UPDATE seller SET BaseSALary = 2090 WHERE DepartmentId = 1");
            
            int rows2 =statement.executeUpdate("UPDATE seller SET BaseSALary = 3090 WHERE DepartmentId = 2");
            connection.commit();
            System.out.println("Rows 1: " + rows1 + "\n rows 2: " + rows2 + "");
        }
        catch (SQLException e){
            try{connection.rollback();
            throw new DbException("Transaction failed, rolled back. Caused by: " + e.getMessage());
            }catch (SQLException ex){
                throw new DbException("Error trying to rollback! Caused by: " + ex.getMessage());
            }

        }
        finally {
            DB.closeConnection();
            DB.closeStatement(statement);
        }
    }
}
