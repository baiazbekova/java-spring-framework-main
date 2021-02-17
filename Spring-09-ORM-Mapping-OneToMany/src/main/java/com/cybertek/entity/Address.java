package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue
    private long id;

    private String street;
    private String zipCode;

    @ManyToOne
    private Person person;

    public Address( String street, String zipCode) {
        this.street = street;
        this.zipCode = zipCode;
    }
}
