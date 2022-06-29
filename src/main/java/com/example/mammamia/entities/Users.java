package com.example.mammamia.entities;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Users {

    public Users() {

    }

    public Users(Integer id, String username, String name_surname, String password, String nation, String gender,
                 String email, Integer roleId,Date dob) {
        this.id = id;
        this.username = username;
        this.name_surname = name_surname;
        this.password = password;
        this.nation = nation;
        this.gender = gender;
        this.email = email;
        this.roleId = roleId;
        this.dob = dob;
    }

    public Users(String username, String name_surname, String password, String nation, String gender, String email, Integer roleId, Date dob) {
        this.username = username;
        this.name_surname = name_surname;
        this.password = password;
        this.nation = nation;
        this.gender = gender;
        this.email = email;
        this.roleId = roleId;
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer rolId) {
        this.roleId = rolId;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date bod) {
        this.dob = bod;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name_surname='" + name_surname + '\'' +
                ", password='" + password + '\'' +
                ", nation='" + nation + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", rolId=" + roleId +
                ", bod=" + dob +
                '}';
    }



    @Id
    @SequenceGenerator(
            name = "users_sequence",
            sequenceName = "users_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence"
    )

    private Integer id;




    private String username;
    private String name_surname;


    private String password;
    private String nation;
    private String gender;
    private String email;



    private Integer roleId;

    private Date dob;


}