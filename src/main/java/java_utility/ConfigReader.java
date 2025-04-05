package java_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    // Load the properties file once
    static {
        try {
            FileInputStream fis = new FileInputStream("C:\\Eclipse\\selenium-framework\\src\\test\\resources\\properties.txt");
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            System.out.println("Error loading config.properties: " + e.getMessage());
        }
    }

    // Method to get value by key
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
