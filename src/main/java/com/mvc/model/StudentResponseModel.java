package com.mvc.model;

import lombok.Data;

import javax.persistence.Column;

@Data
public class StudentResponseModel {

    private int id;
    private String fName;
    private String lName;
    private String address;
    private String phoneNo;


}
