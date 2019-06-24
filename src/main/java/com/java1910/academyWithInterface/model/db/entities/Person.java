package com.java1910.academyWithInterface.model.db.entities;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    private Date birthday;

    @Column(unique = true)
    private String passport;

    @Column(unique = true)
    private String phone;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="person_id")
    private Set<Student> studentSet;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="person_id")
    private Set<Teacher> teacherSet;

    public Person(String name, Date birthday, String passport, String phone) {
        this.name = name;
        this.birthday = birthday;
        this.passport = passport;
        this.phone = phone;
        studentSet = new HashSet<>();
        teacherSet = new HashSet<>();
    }

    public Person() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void addStudent(Student student) {
        studentSet.add(student);
    }

    public void removeStudent(Student student) {
        studentSet.remove(student);
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public void addTeacher(Teacher teacher){
        teacherSet.add(teacher);
    }

    public boolean removeTeacher(Teacher teacher){
        return teacherSet.remove(teacher);
    }

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

}
