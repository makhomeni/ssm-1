package net.softengine.ssm.admin.dao;

import java.util.List;
import net.softengine.ssm.admin.model.Image;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/12/15
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */

public interface ImageDAO {
    public boolean save(Image image);

    public boolean update(Image image);

    public boolean delete(Image image);

    public Image getImage(Long id);

    public Image getImage(String query);

    public List<Image> findAllImage();

    public List<Image> findAllImage(String query);
}