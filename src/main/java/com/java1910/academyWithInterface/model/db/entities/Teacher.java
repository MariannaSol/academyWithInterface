package com.java1910.academyWithInterface.model.db.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Teacher {
    @Id
    @GeneratedValue
    private long id;

    private Date start;

    private Date finish;

    private BigDecimal salary;

    @ManyToOne
    private Person person;

    // private TeacherSubject teacherSubject;

    // private Schedule schedule;

    //  private Set<Mark> marks;

    public Teacher(Date start, Date finish, BigDecimal salary, Person person) {
        this.start = start;
        this.finish = finish;
        this.salary = salary;
        this.person = person;
    }

    public Teacher() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

  /*  public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Set<Mark> getMark() {
        return marks;
    }

    public boolean addMark(Mark mark){
        return marks.add(mark);
    }

    public boolean removeMark(Mark mark){
        return marks.remove(mark);
    } */

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", start=" + start +
                ", finish=" + finish +
                ", salary=" + salary +
                ", person=" + person +
                //    ", teacherSubject=" + teacherSubject +
                //   ", schedule=" + schedule +
                //    ", mark=" + marks +
                '}';
    }

}
