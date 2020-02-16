package com.java.util;

import java.io.IOException;
import java.util.Properties;

/**
 *  .properties文件读取类，该类提供资源文件的取值方法
 * @Description: 
 * @author: wqk
 * @date: 2019下午11:37:50
 * @version: 1.0
 */
public class PropertyUtil {

    private Properties proper = null;

    public PropertyUtil() {
        super();
    }

    public PropertyUtil(String propertName) {
        String fileName = "/" + propertName + ".properties";
        proper = new Properties();
        try {
            proper.load(PropertyUtil.class.getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
             *根据键获得值
     * @param key
     * @return
     * @return: String
     */
    public String getValue(String key) {
        return proper.getProperty(key);
    }

    public String getValue(String key, String defaultVal) {
        String value = getValue(key);
        return (value == null) ? defaultVal : value;
    }

    public static void main(String[] args) {
        PropertyUtil proper = new PropertyUtil("config");
        String value = proper.getValue("className");
        System.out.println(value);
    }
}
