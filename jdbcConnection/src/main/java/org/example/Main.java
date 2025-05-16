package org.example;

import src.db.DB;
import src.db.DbException;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try{
            Connection connection = DB.getConnection();
            System.out.println("Sucesso");
        }
        catch (Exception e){
            throw new DbException(e.getMessage());
        }

    }
}