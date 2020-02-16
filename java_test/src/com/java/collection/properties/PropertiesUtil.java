package com.java.collection.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    private Properties properties;
    private String     propertiesName;

    public PropertiesUtil() {
        super();
    }

    public PropertiesUtil(String propertiesName) {
        properties = new Properties();
        this.propertiesName = propertiesName;
        try {
            properties.load(new FileInputStream(new File(this.propertiesName)));
            //            properties.load(PropertiesUtil.class.getResourceAsStream(this.propertiesName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     * @Description: 写入配置信息
     * @throws FileNotFoundException
     * @throws IOException
     * @return: void
     */
    public void setValue(PropertiesUtil propertiesUtil) throws FileNotFoundException, IOException {
        Properties properties = propertiesUtil.getProperties();
        properties.store(new FileOutputStream(new File(propertiesName)), "这是注释");
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }

    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
    }

    public String getValue(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    public static void main(String[] args) {

        PropertiesUtil util = new PropertiesUtil("/config.properties");
        try {
            util.setProperty("aa", "11");
            util.setProperty("bb", "22");
            util.setProperty("cc", "33");
            util.setValue(util);
            System.out.println(util.getValue("cc"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
