package org.syh.dao;

import org.syh.dao.impl.DemoCeltisDaoImpl;

public class DaoFactory {
    public static DemoDao getDemoDao() {
        return new DemoCeltisDaoImpl();
    }
}
