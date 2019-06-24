package com.java1910.academyWithInterface.model.db.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Form {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="contract_id")
    private Set<Group> groupSet;

    public Form(String name) {
        this.name = name;
        groupSet = new HashSet<>();
    }

    public Form() {
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

    public void setGroupSet(Set<Group> groupSet) {
        this.groupSet = groupSet;
    }

    public boolean addGroup(Group group){
        return groupSet.add(group);
    }

    public boolean removeGroup(Group group){
        return groupSet.remove(group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Form form = (Form) o;

        if (id != form.id) return false;
        if (!groupSet.equals(form.groupSet)) return false;
        if (!name.equals(form.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + groupSet.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groupSet=" + groupSet +
                '}';
    }
}
