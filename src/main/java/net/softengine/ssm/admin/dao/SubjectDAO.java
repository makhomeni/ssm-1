package net.softengine.ssm.admin.dao;

import net.softengine.ssm.admin.model.Subject;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/12/15
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */

public interface SubjectDAO {
    public boolean save(Subject subject);

    public boolean update(Subject subject);

    public boolean delete(Subject subject);

    public Subject getSubject(Long id);

    public Subject getSubject(String query);

    public List<Subject> findAllSubject();

    public List<Subject> findAllSubject(String query);
}