package net.softengine.ssm.exam.dao;

import net.softengine.ssm.exam.model.MarksSheet;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/12/15
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */

public interface MarksSheetDAO {
    public boolean save(MarksSheet marksSheet);

    public boolean update(MarksSheet marksSheet);

    public boolean delete(MarksSheet marksSheet);

    public MarksSheet getMarksSheet(Long id);

    public MarksSheet getMarksSheet(String query);

    public List<MarksSheet> findAllMarksSheet();

    public List<MarksSheet> findAllMarksSheet(String query);
}