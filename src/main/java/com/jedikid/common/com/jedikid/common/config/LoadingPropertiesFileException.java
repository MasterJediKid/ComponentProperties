package com.jedikid.common.com.jedikid.common.config;

/**
 * @author MasterJediKid
 */
public class LoadingPropertiesFileException extends RuntimeException {
 
    public LoadingPropertiesFileException(){
        super("Unable to load conf/component.properties file.");
    }
}
