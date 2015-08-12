package net.softengine.ssm.exam.dao;

import net.softengine.ssm.exam.model.Exam;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/12/15
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */

public interface ExamDAO {
    public boolean save(Exam exam);

    public boolean update(Exam exam);

    public boolean delete(Exam exam);

    public Exam getExam(Long id);

    public Exam getExam(String query);

    public List<Exam> findAllExam();

    public List<Exam> findAllExam(String query);
}