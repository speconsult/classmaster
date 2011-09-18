package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:05
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Course extends AbstractClassMasterModel {

    @ManyToMany(targetEntity = Teacher.class, mappedBy = "courses")
    public List<Teacher> teachers;
    @ManyToMany(targetEntity = Student.class, mappedBy = "courses")
    public List<Student> students;
    @OneToOne
    public Message description;



}
