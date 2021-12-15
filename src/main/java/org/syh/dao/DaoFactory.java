package org.syh.dao;

public class DaoFactory {
    public static DemoDao getDemoDao() {
        try {
            return (DemoDao) Class.forName("org.syh.dao.impl.DemoCeltisDaoImpl").newInstance();
        } catch (Exception exp) {
            exp.printStackTrace();
            throw new RuntimeException("DemoDao instantiation error, cause: " + exp.getMessage());
        }
    }
}
