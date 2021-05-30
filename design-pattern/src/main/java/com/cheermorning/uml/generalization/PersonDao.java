package com.cheermorning.uml.generalization;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-11
 */
public class PersonDao extends DaoSupport {
    @Override
    public void save(Object entity) {
        System.out.println("save");
    }

    @Override
    public void delete(Object id) {
        System.out.println("delete....");
    }
}
