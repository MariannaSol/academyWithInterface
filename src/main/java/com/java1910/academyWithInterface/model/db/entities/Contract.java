package com.java1910.academyWithInterface.model.db.entities;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Contract {
    @Id
    @GeneratedValue
    private long id;

    private BigDecimal cost;

    private BigDecimal paged;

    private String name;

    public Contract(BigDecimal cost, BigDecimal paged) {
        this.cost = cost;
        this.paged = paged;
    }

    public Contract(BigDecimal cost, BigDecimal paged, String name) {
        this.cost = cost;
        this.paged = paged;
        this.name = name;
    }

    public Contract(String name) {
        this.name = name;
    }

    public Contract() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getPaged() {
        return paged;
    }

    public void setPaged(BigDecimal paged) {
        this.paged = paged;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", cost=" + cost +
                ", paged=" + paged +
                '}';
    }
}
