/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.LoadingProperties.ApacheCommons;

import static org.junit.Assert.*;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Before;
import org.junit.Test;

public class ConfigTest {
    private static final String CONFIG_FILE = "config/apache_commons.properties";
    private Config fixture;

    @Before public void setUp() throws Exception {
        fixture = Config.builder().configFilename(CONFIG_FILE).build();
    }

    @Test public void shouldReadPropertiesFile() throws Exception {
        PropertiesConfiguration p = fixture.readPropertiesFile();
        assertEquals("calvin", p.getProperty("database.username"));
        assertEquals("jdbc:mysql://localhost:3306/calvin", p.getProperty("database.url"));
        assertEquals("com.mysql.jdbc.Driver", p.getProperty("database.driver"));
    }

}
