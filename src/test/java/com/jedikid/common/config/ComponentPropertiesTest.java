package com.jedikid.common.config;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author MasterJediKid
 */
public class ComponentPropertiesTest { 
    
    @Test
    public void testProperWorkflow() {
        Assert.assertTrue(ComponentProperties.getPropertyValueFor("test.property").equals("test-value"));
    }
    
    @Test
    public void testFileMissingPropertyWorkflow() {        
        try {
            ComponentProperties.getPropertyValueFor("test.property.not.there");
            Assert.assertTrue(false);
        }
        catch(FileMissingPropertyException ex) {
            Assert.assertTrue(true);
        }
    }
}