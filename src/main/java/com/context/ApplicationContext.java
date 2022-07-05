package com.context;

import com.exeption.NoSuchBeanException;

import java.util.Map;

public interface ApplicationContext {

    <T> T getBean(Class<T> beanType) throws NoSuchBeanException;
    <T> Object getBean(String name, Class<T> beanType);
    <T> Map<String,Object> getAllBeans(Class<T> beanType);
}
