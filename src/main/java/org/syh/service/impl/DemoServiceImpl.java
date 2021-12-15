package org.syh.service.impl;

import org.syh.dao.DemoDao;
import org.syh.dao.impl.DemoGinkgoDaoImpl;
import org.syh.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {
    private DemoDao demoDao = new DemoGinkgoDaoImpl();
    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
