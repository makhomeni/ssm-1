package net.softengine.ssm.security.model;

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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type",  discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("user")
@Table(name = "SEC_USER")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    private String active;

    private String Token;

    private String name;

    private String addressLineOne;

    private String addressLineTwo;

    private String phone;

    private String sex;

    private String email;
}
