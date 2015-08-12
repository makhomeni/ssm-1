package net.softengine.ssm.admin.model;

import net.softengine.ssm.security.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/11/15
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name= "AD_SUBJECT")
public class Subject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    private String name;

    private Long subjectCode;

    List<Klass> klassList = new ArrayList<Klass>();
}
