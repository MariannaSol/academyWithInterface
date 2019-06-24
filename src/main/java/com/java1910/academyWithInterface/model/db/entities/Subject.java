package com.java1910.academyWithInterface.model.db.entities;

import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToOne
    private Specialization specialization;

 //   private Schedule schedule;

  //  private Mark marks;

    public Subject(String name) {
        this.name = name;
    }

    public Subject() {
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

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

  /*  public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Mark getMarks() {
        return marks;
    }

    public void setMarks(Mark marks) {
        this.marks = marks;
    } */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        if (id != subject.id) return false;
     //   if (marks != null ? !marks.equals(subject.marks) : subject.marks != null) return false;
        if (name != null ? !name.equals(subject.name) : subject.name != null) return false;
     //   if (schedule != null ? !schedule.equals(subject.schedule) : subject.schedule != null) return false;
        if (specialization != null ? !specialization.equals(subject.specialization) : subject.specialization != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (specialization != null ? specialization.hashCode() : 0);
    //    result = 31 * result + (schedule != null ? schedule.hashCode() : 0);
     //   result = 31 * result + (marks != null ? marks.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                '}';
    }
}
