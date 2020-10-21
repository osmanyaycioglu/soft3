package com.training.java.reflection;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyRead {

    public static void main2(final String[] args) {
        try {
            Properties propertiesLoc = new Properties();
            File fileLoc = new File("myprop.properties");
            FileInputStream fileInputStreamLoc = new FileInputStream(fileLoc);
            propertiesLoc.load(fileInputStreamLoc);
            MyProp myPropLoc = new MyProp();
            myPropLoc.setHost(propertiesLoc.getProperty("db.connection.host"));
            myPropLoc.setPort(Integer.parseInt(propertiesLoc.getProperty("db.connection.port")));
            myPropLoc.setConnectionCount(Integer.parseInt(propertiesLoc.getProperty("db.connection.connection.count")));
            myPropLoc.setConnectionTimeout(Long.parseLong(propertiesLoc.getProperty("db.connection.connection.timeout")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(final String[] args) {
        MyProp myPropLoc = new MyProp();
        PropertyEngine engineLoc = new PropertyEngine();
        engineLoc.readProps(myPropLoc);
        System.out.println(myPropLoc);
    }

}
