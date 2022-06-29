package com.example.mammamia.entities;

import javax.persistence.*;

@Entity
@Table
public class Role {



    @Id
    @SequenceGenerator(
            name = "role_sequence",
            sequenceName = "role_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "role_sequence"
    )
    private Integer id;
    private String roleName;

    private Integer price;

    public Role(Integer id, String roleName, Integer price) {
        this.id = id;
        this.roleName = roleName;
        this.price = price;
    }
    public Role(){}

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", price=" + price +
                '}';
    }


}
