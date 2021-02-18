package com.cybertek.bootstrap;

import com.cybertek.entity.Address;
import com.cybertek.entity.Person;
import com.cybertek.repository.AddressRepository;
import com.cybertek.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;
import java.util.List;

public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run (String ... args) throws Exception{
        Person p1 = new Person ("Mike", "Smith");
        Person p2 = new Person ("Aigerim", "Baiazbekova");
        Person p3 = new Person("Bermet", "Zhakypzhan");

        Address a1 = new Address( "2600 Netherland", "10463");
        Address a2 = new Address( "8032 Winston", "19118");
        Address a3 = new Address( "1470 Walley", "22222");

        //p1.setAddresses(Arrays.asList(a1,a2));  //case-1
        //personRepository.save(p1);

        a1.setPerson(p1);
        a2.setPerson(p1);
        a3.setPerson(p1);

        addressRepository.save(a1);
        addressRepository.save(a2);
        addressRepository.save(a3);

    }
}
