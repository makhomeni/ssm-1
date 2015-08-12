package net.softengine.ssm.exam.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/11/15
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "EX_MARKS_CONFIG")
public class MarksConfig  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    private Long klassId;

    private Long subjectId;

    private Long fullMarks;

    private Long countableMarks;

}
