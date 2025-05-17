package org.example;

import src.db.DB;
import src.db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try{
            connection = DB.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT * FROM department");
            while (rs.next()){
                System.out.println(rs.getInt("id") +"\t"+ rs.getString("name"));
            }
        }
        catch (Exception e){
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeConnection();
            DB.closeStatement(statement);
            DB.closeResultSet(rs);
        }


    }
}