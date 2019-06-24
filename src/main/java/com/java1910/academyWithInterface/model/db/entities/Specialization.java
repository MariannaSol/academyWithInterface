package com.java1910.academyWithInterface.model.db.entities;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Specialization {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="spec_id")
    private Set<Group> groupSet;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Subject> subjectSet;

    public Specialization(String name) {
        this.name = name;
        groupSet = new HashSet<>();
        subjectSet =new HashSet<>();
    }

    public Specialization() {
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

    public Set<Group> getGroupSet() {
        return groupSet;
    }

    public boolean addGroup(Group group){
        return groupSet.add(group);
    }

    public boolean removeGroup(Group group){
        return groupSet.remove(group);
    }

    public boolean addSubject(Subject subject){
        return this.subjectSet.add(subject);
    }

    public boolean removeSubject(Subject subject){
        return this.subjectSet.remove(subject);
    }

  /*  public Set<Subject> getSubjectSet() {
        return subjectSet;
    }

    public boolean addSubject(Subject subject){
        return subjectSet.add(subject);
    }

    public boolean removeSubject(Subject subject){
        return subjectSet.remove(subject);
    } */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Specialization Specialization = (Specialization) o;

        if (id != Specialization.id) return false;
        if (!groupSet.equals(Specialization.groupSet)) return false;
        if (!name.equals(Specialization.name)) return false;
      //  if (!subjectSet.equals(Specialization.subjectSet)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + groupSet.hashCode();
     //   result = 31 * result + subjectSet.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "name='" + name + '\'' +
                '}';
    }
}
