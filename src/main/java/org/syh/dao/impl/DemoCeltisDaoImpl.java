package org.syh.dao.impl;

import org.syh.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoCeltisDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("occidentalis");
    }
}
