package ch.sekthor.project.service;

import java.util.Properties;

public class ServiceLocator {
    /**
     * This class is a Singleton. There is only one static instance of a ServiceLocator.
     * The entire Application will only use this instance.
     */
    private static ServiceLocator serviceLocator;
    private Properties properties;


    // private constructor
    private ServiceLocator(){
        properties = new Properties();

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
}
