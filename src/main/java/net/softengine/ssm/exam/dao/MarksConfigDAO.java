package net.softengine.ssm.marksConfig.dao;

import net.softengine.ssm.exam.model.MarksConfig;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/12/15
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */

public interface MarksConfigDAO {
    public boolean save(MarksConfig marksConfig);

    public boolean update(MarksConfig marksConfig);

    public boolean delete(MarksConfig marksConfig);

    public MarksConfig getMarksConfig(Long id);

    public MarksConfig getMarksConfig(String query);

    public List<MarksConfig> findAllMarksConfig();

    public List<MarksConfig> findAllMarksConfig(String query);
}