package com.cheermorning.mode.structural.proxy.staticproxy;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 代理对象
 * @date 2021-5-11
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao teacherDao;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        super();
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理！");
        teacherDao.teach();
        System.out.println("结束代理！");

    }
}
