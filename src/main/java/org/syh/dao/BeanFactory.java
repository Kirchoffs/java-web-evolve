package org.syh.dao;

import java.util.Properties;

public class BeanFactory {
    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (Exception exp) {
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + exp.getMessage());
        }
    }

    public static Object getBean(String beanName) {
        try {
            Class<?> beanClass = Class.forName(properties.getProperty(beanName));
            return beanClass.newInstance();
        } catch (ClassNotFoundException exp) {
            exp.printStackTrace();
            throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", exp);
        } catch (IllegalAccessException | InstantiationException exp) {
            throw new RuntimeException("[" + beanName + "] instantiation error!", exp);
        }
    }
}
