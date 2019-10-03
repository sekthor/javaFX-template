package ch.sekthor.project.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnector {

    private Connection connection;
    private String dbDatabase, dbUser, dbPassword;


    public DatabaseConnector(Properties prop){
        this.dbDatabase = prop.getProperty("dbDatabase");
        this.dbUser = prop.getProperty("dbUser");
        this.dbPassword = prop.getProperty("dbPassword");
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/" + dbDatabase + "?useLegacyDatetimeCode=false&serverTimezone=UTC", dbUser, dbPassword);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
