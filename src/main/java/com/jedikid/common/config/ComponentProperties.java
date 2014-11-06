package com.jedikid.common.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MasterJediKid
 */
public class ComponentProperties extends Properties{
    
    private static final Logger logger = LoggerFactory.getLogger(ComponentProperties.class);
    private static final ComponentProperties singleton = new ComponentProperties();
    
    private static final String CONFIG = "/conf/component.properties";
    
    public static ComponentProperties getInstance() {
        return singleton;
    }
    
    public String getPropertyValueFor(String property) {
        String value = getInstance().getProperty(property);
        
        if(value != null)
            return value;
        
        throw new FileMissingPropertyException(property);    
    }

    private ComponentProperties() {
        
        InputStream input = this.getClass().getResourceAsStream(CONFIG);

        
        logger.debug("// Checking if componet.properties file was found");
        if(input == null)
            throw new NoPropertiesFileException();
        
        // Load properties file
        logger.debug("// Loading config properties file");
        try {
            this.load(input);
            input.close();
        }
        catch(IOException ex) {
            throw new LoadingPropertiesFileException();
        }
    }
}
