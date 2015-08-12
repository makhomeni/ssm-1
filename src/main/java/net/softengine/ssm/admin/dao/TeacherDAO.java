package net.softengine.ssm.admin.dao;

import net.softengine.ssm.admin.model.Teacher;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/12/15
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */

public interface TeacherDAO {
    public boolean save(Teacher teacher);

    public boolean update(Teacher teacher);

    public boolean delete(Teacher teacher);

    public Teacher getTeacher(Long id);

    public Teacher getTeacher(String query);

    public List<Teacher> findAllTeacher();

    public List<Teacher> findAllTeacher(String query);
}