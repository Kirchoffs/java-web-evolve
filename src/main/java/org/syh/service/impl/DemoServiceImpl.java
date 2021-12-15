package org.syh.service.impl;

import org.syh.dao.DaoFactory;
import org.syh.dao.DemoDao;
import org.syh.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {
    private DemoDao demoDao = DaoFactory.getDemoDao();
    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
