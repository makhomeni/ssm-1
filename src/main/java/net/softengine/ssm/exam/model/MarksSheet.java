package net.softengine.ssm.exam.model;

import net.softengine.ssm.admin.model.Klass;
import net.softengine.ssm.admin.model.Subject;

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
@Table(name ="EX_MARKS_SHEET")
public class MarksSheet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Klass klass;

    private Subject subject;

    private Exam exam;
}
