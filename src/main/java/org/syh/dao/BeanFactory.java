package org.syh.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    private static Properties properties;
    private static Map<String, Object> beanMap = new HashMap<>();

    static {
        properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (Exception exp) {
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + exp.getMessage());
        }
    }

    public static Object getBean(String beanName) {
        if (!beanMap.containsKey(beanName)) {
            synchronized (BeanFactory.class) {
                if (!beanMap.containsKey(beanName)) {
                    try {
                        Class<?> beanClass = Class.forName(properties.getProperty(beanName));
                        Object bean = beanClass.newInstance();
                        beanMap.put(beanName, bean);
                    } catch (ClassNotFoundException exp) {
                        exp.printStackTrace();
                        throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", exp);
                    } catch (IllegalAccessException | InstantiationException exp) {
                        throw new RuntimeException("[" + beanName + "] instantiation error!", exp);
                    }
                }
            }
        }
        return beanMap.get(beanName);
    }
}
