package ch.sekthor.project.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {

    private Connection connection;
    private String dbDatabase, dbUser, dbPassword;

    public DatabaseConnector(){
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/" + dbDatabase, dbUser, dbPassword);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
