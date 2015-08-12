package net.softengine.ssm.exam.model;

import net.softengine.ssm.admin.model.Student;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/11/15
 * Time: 11:00 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "EX_MARKS")
public class Marks  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    private MarksSheet marksSheet;
@ManyToOne
    private Student student;

    private String written;

    private String mcq;

    private String practical;

}
