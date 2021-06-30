package com.mvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "fname")
    private String fName;
    @Column(name = "lname")
    private String lName;
    @Column(name = "address")
    private String address;
    @Column(name = "phoneno")
    private String phoneNo;


    public Student(Student student) {
    }
}
