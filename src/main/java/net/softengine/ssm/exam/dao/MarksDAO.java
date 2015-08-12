package net.softengine.ssm.marks.dao;

import net.softengine.ssm.exam.model.Marks;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/12/15
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */

public interface MarksDAO {
    public boolean save(Marks marks);

    public boolean update(Marks marks);

    public boolean delete(Marks marks);

    public Marks getMarks(Long id);

    public Marks getMarks(String query);

    public List<Marks> findAllMarks();

    public List<Marks> findAllMarks(String query);
}