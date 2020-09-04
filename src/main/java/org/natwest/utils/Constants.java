package org.natwest.utils;

/**
 * It contain public and final variables to be used in project
 */
public interface Constants {

   String PATH_TO_CONFIG_FILE = System.getProperty("user.dir")+"/src/test/resources/config.properties";
   int TIMEOUT_IN_SECONDS = 5;
   int POLLING_AFTER_EVERY_MILLISECONDS = 100;
}
