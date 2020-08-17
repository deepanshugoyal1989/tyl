package org.natwest.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * It helps to read properties file anywhere in the project.
 */
public class ReadProperties {

    private final Properties properties = new Properties();
    private final Log log = new Log(ReadProperties.class);

    /**
     * Constructor to initialize properties file
     */
    public ReadProperties() {

        try {
            FileInputStream fileInputStream = new FileInputStream(Constants.PATH_TO_CONFIG_FILE);
            properties.load(fileInputStream);

        } catch (IOException e) {
            log.error("Error in reading config property file : "+e.getMessage());
        }

    }

    /**
     * It read value of a given key from properties file
     * @param propertyKey key to read its value
     * @return Value of key
     */
    public String getProperty(String propertyKey) {
        String value = properties.getProperty(propertyKey);
        log.info("Returning value: "+value+" of key: "+propertyKey);
        return value;

    }
}
