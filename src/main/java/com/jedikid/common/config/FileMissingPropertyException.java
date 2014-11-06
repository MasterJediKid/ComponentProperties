package com.jedikid.common.config;

/**
 * @author MasterJediKid
 */
public class FileMissingPropertyException extends RuntimeException {
    
    public FileMissingPropertyException  (String property){
        super("There is no "+ property + ", set in the conf/component.properties file." );
    }
}
