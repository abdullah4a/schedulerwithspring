package com.example.scheduler.entities;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @Column(name = "addressId", nullable = false)
    private Long addressId;
    @Column(name = "postalCode", nullable = false)
    private String postalCode;
    @Column(name = "country")
    private String Country;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String Street;

//    @ManyToMany(mappedBy = "address")
//    private Collection<User> user;

//    public Collection<User> getUser() {
//        return user;
//    }
//
//    public void setUser(Collection<User> user) {
//        this.user = user;
//    }
}
