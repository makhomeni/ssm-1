package net.softengine.ssm.admin.model;

import net.softengine.ssm.security.model.User;

import javax.persistence.*;
import java.io.Serializable;
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

    List<Student> studentList;

    List<Subject> subjectList;

    Teacher classTeacher;

    private Long gpDevidedBy;



}
