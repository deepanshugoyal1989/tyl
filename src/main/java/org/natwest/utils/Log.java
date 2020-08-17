package org.natwest.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * It helps to initialize logger that can be used across project.
 */
public class Log {

    private final Logger Log;

    public Log(Class clazz) {
        Log = LogManager.getLogger(clazz);
    }

    public void debug(String message) {
        Log.debug("DEBUG: " + message);
    }

    public void info(String message) {
        Log.info("INFO: " + message);
    }

    public void warn(String message) {
        Log.warn("WARNING: " + message);
    }

    public void error(String message) {
        Log.error("ERROR: " + message);
    }

    public void fatal(String message) {
        Log.fatal("FATAL: " + message);

    }
}
