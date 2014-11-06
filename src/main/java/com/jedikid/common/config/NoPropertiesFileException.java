package com.jedikid.common.config;

/**
 * @author MasterJediKid
 */
public class NoPropertiesFileException extends RuntimeException {
 
    public NoPropertiesFileException(){
        super("Please check that your conf/component.properties file, exists.");
    }
}
