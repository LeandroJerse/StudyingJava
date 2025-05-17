package src.main.java.org.example;

import src.db.DB;
import src.db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class insertQuery {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = DB.getConnection();
            statement = connection.prepareStatement("INSERT INTO seller "+
                    "(Name, Email, BirthDate, BaseSalary, DepartmentId)"+
                    "VALUES (?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, "August Marx");
            statement.setString(2, "August@Marx");
            statement.setDate(3,new java.sql.Date(sdf.parse("21/07/1975").getTime()) );
            statement.setDouble(4, 7000.00);
            statement.setInt(5, 3);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0){
                ResultSet rs = statement.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("ID: " + id);
                    
                }
            }
            else{
                throw new DbException("Erro ao inserir dados no banco de dados");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        finally {
            DB.closeStatement(statement);
            DB.closeConnection();

        }

    }
}
