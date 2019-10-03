package ch.sekthor.project.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ServiceLocator {
    /**
     * This class is a Singleton. There is only one static instance of a ServiceLocator.
     * The entire Application will only use this instance.
     */
    private static ServiceLocator serviceLocator;
    private Properties properties;
    private  DatabaseConnector databaseConnector;


    // private constructor
    private ServiceLocator(){
        // initialize properties
        this.properties = new Properties();
        try (InputStream input = new FileInputStream("src/ch/sekthor/project/properties/config.properties")) {
            properties.load(input);
        } catch (IOException e){
            e.printStackTrace();
        }
        // initialize databaseConnector
        this.databaseConnector = new DatabaseConnector(properties);
    }

    /**
     * Factory Method
     * @return serviceLocator
     */
    public static ServiceLocator getServiceLocator(){
        if(serviceLocator == null){
            serviceLocator = new ServiceLocator();
        }
        return serviceLocator;
    }

    public Properties getProperties() {
        return properties;
    }

    public DatabaseConnector getDatabaseConnector() {
        return databaseConnector;
    }
}
