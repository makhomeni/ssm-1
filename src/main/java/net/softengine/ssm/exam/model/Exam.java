package net.softengine.ssm.exam.model;

import net.softengine.ssm.security.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/11/15
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table( name = "EX_EXAM")
public class Exam implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    List<MarksConfig> marksConfigList = new ArrayList<MarksConfig>();

}
