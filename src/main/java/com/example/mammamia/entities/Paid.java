package com.example.mammamia.entities;

import javax.persistence.*;

@Entity
@Table
public class Paid {


    @SequenceGenerator(
            name = "paid_sequence",
            sequenceName = "paid_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "paid_sequence"
    )

    @Id
    private Integer user_id;
    private boolean paid;


    public Paid(){}
    public Paid(Integer user_id, boolean paid) {
        this.user_id = user_id;
        this.paid = paid;
    }



    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Paid{" +
                "user_id=" + user_id +
                ", paid=" + paid +
                '}';
    }



}
