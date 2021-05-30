package com.cheermorning.uml.generalization;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-11
 */
public abstract class DaoSupport {

    public abstract void save(Object entity);
    public abstract void delete(Object id);
}
