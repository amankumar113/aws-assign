package com.example.Aws.Assignment.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Employee_data")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EmployeeId;
    private String name;
    private String Department;
}
