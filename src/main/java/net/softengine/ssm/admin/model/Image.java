package net.softengine.ssm.admin.model;

import net.softengine.ssm.security.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "AD_IMAGE")
public class Image implements Serializable {
    @Id
    @GeneratedValue(strateg = GenerationType.AUTO)
    private Long id;

    private String docOf;

    private String originalName;

    private String givenName;

    private String resourceDirectory;

    private String extension;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "record_date")
    private Date recordDate;

    @OneToOne(mappedBy = "image")
    Student student;


}