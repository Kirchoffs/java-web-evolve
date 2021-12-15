package org.syh.dao.impl;

import org.syh.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoGinkgoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("biloba");
    }
}

