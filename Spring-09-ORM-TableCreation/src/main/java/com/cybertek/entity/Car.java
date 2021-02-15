package com.cybertek.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car {

    @Id
    private int id;

    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }


}
