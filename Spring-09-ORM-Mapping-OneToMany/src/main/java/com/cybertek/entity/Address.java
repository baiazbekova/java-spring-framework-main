package com.cybertek.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Address {
    @Id
    private long id;

    private String street;
    private String zipCode;

    @ManyToOne
    private Person person;


}
