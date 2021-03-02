package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "departments")
@ToString
@NamedQuery(name="Department.findOzzyDepartment",
            query="select d from Department d where d.division=?1")

@NamedNativeQuery(name="Department.countAllDepartments",
                query="SELECT count(*) FROM departments",
                resultClass = Department.class)

public class Department {
    @Id
    private String department;
    private String division;
}
