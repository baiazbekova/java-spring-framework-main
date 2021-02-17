package com.cybertek.bootstrap;

import com.cybertek.entity.Address;
import com.cybertek.entity.Person;
import com.cybertek.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;
import java.util.List;

public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Override
    public void run (String ... args) throws Exception{
        Person p1 = new Person ("Mike", "Smith");
        Person p2 = new Person ("Aigerim", "Baiazbekova");
        Person p3 = new Person("Bermet", "Zhakypzhan");

        Address a1 = new Address( "2600 Netherland", "10463");
        Address a2 = new Address( "8032 Winston", "19118");
        Address a3 = new Address( "1470 Walley", "22222");

        p1.setAddresses(Arrays.asList(a1,a2));

        personRepository.save(p1);

    }
}
