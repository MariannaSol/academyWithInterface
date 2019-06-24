package com.java1910.academyWithInterface.model.db.entities;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "\"Group\"")
public class Group {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="group_id")
    private Set<Student> studentSet;

    @ManyToOne
    private Form form;

    @ManyToOne
    private Specialization spec;

    //  private Set<Schedule> schedules;

    public Group(String name, Form form, Specialization spec) {
        this.name = name;
        this.form = form;
        this.spec = spec;
        studentSet = new HashSet<>();
    }

    public Group() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        studentSet.add(s);
    }

    public void removeStudent(Student s) {
        studentSet.remove(s);
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

   public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Specialization getSpec() {
        return spec;
    }

    public void setSpec(Specialization spec) {
        this.spec = spec;
    }


  /*    public boolean removeSchedules(Schedule schedule){
        return schedules.remove(schedule);
    }

    public boolean addSchedules(Schedule schedule){
        return schedules.add(schedule);
    }

    public Set<Schedule> getSchedules() {
        return schedules;
    }

    public Marks getMark() {
        return mark;
    }

    public void setMark(Marks mark) {
        this.mark = mark;
    } */


    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentSet=" + studentSet +
                  ", form=" + form +
                   ", spec=" + spec +
                 //  ", mark=" + mark +
                //   ", schedules=" + schedules +
                '}';
    }

}
