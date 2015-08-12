package net.softengine.ssm.admin.dao;

import net.softengine.ssm.admin.model.Klass;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/12/15
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */

public interface KlassDAO {
    public boolean save(Klass klass);

    public boolean update(Klass klass);

    public boolean delete(Klass klass);

    public Klass getKlass(Long id);

    public Klass getKlass(String query);

    public List<Klass> findAllKlass();

    public List<Klass> findAllKlass(String query);
}