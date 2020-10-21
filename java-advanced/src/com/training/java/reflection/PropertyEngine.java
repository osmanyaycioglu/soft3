package com.training.java.reflection;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class PropertyEngine {

    public void readProps(final Object obj) {
        Class<?> clazz = obj.getClass();
        PropFile propFileLoc = clazz.getAnnotation(PropFile.class);
        if (propFileLoc != null) {
            try {
                Properties propertiesLoc = new Properties();
                File fileLoc = new File(propFileLoc.value());
                FileInputStream fileInputStreamLoc = new FileInputStream(fileLoc);
                propertiesLoc.load(fileInputStreamLoc);
                // Field
                Field[] declaredFieldsLoc = clazz.getDeclaredFields();
                for (Field fieldLoc : declaredFieldsLoc) {
                    Prop annotationLoc = fieldLoc.getAnnotation(Prop.class);
                    if (annotationLoc != null) {
                        fieldLoc.setAccessible(true);
                        String propertyLoc = propertiesLoc.getProperty(annotationLoc.value());
                        Class<?> typeLoc = fieldLoc.getType();
                        if (String.class == typeLoc) {
                            fieldLoc.set(obj,
                                         propertyLoc);
                        } else if (typeLoc.getName()
                                          .equals("int")) {
                            fieldLoc.setInt(obj,
                                            Integer.parseInt(propertyLoc));
                        } else if (typeLoc.getName()
                                          .equals("long")) {
                            fieldLoc.setLong(obj,
                                             Long.parseLong(propertyLoc));
                        }
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
