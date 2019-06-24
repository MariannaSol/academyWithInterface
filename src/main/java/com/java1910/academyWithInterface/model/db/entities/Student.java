package com.java1910.academyWithInterface.model.db.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;

    private Date start;

    private Date finish;

    private String diploma;

    @ManyToOne
    private Person person;

    @ManyToOne
    private Group group;

    @OneToOne
    @JoinColumn(name="contract_id")
    private Contract contract;

    //  private Set<Mark> marks;

    public Student(Date start, Date finish, String diploma, Person person, Group group, Contract contract) {
        this.start = start;
        this.finish = finish;
        this.diploma = diploma;
        this.person = person;
        this.contract = contract;
        this.group = group;
    }

    public Student(Date start, Date finish, Person person, Group group, Contract contract) {
        this.start = start;
        this.finish = finish;
        this.person = person;
        this.group = group;
        this.contract = contract;
    }

    public Student() {
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

 /*   public Set<Mark> getMarks() {
        return marks;
    }

    public boolean addMark(Mark mark){
        return this.marks.add(mark);
    }

    public boolean removeMark(Mark mark){
        return this.marks.remove(mark);
    }*/

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", start=" + start +
                ", finish=" + finish +
                ", diploma='" + diploma + '\'' +
                ", person=" + person +
                ", group=" + group +
                ", contract=" + contract +
                '}';
    }
}
