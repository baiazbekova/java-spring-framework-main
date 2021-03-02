package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "departments")
@ToString
@NamedQuery(name="Department.findOzzyDepartment",
            query="select d from Department d where d.division=?1")

public class Department {
    @Id
    private String department;
    private String division;
}
