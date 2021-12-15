package org.syh.service.impl;

import org.syh.dao.BeanFactory;
import org.syh.dao.DemoDao;
import org.syh.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {
    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");
    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
