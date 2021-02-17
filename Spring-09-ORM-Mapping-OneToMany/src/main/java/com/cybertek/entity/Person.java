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
public class Person {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn(name="person_id")
    private List <Address> addresses;
//    @OneToMany
//    @JoinColumn ("person_id")
//    private List<Address> address; //collection


    public Person( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
