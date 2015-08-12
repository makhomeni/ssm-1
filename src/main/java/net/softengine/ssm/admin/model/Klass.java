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
@Table(name = "AD_CLASS")
public class Klass extends User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    List<Student> studentList = new ArrayList<Student>();

    List<Subject> subjectList = new ArrayList<Subject>();

    private Teacher classTeacher;

    private Long gpDevidedBy;



}
