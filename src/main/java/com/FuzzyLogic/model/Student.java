package com.FuzzyLogic.model;

import javax.persistence.*;
import javax.security.auth.Subject;
import java.util.List;

/**
 * Created by rohit_000 on 9/1/2017.
 */
@Entity
public class Student {


    @Id
    private String stdSymbolNo;
    private int batch;
    private String stdName;
    @Column(name="address", nullable=false, length=100)
    private String address;
    private String phoneNo;




    @OneToMany(mappedBy = "student")
    private List<Subject> subjectList;

    public String getStdSymbolNo() {
        return stdSymbolNo;
    }

    public void setStdSymbolNo(String stdSymbolNo) {
        this.stdSymbolNo = stdSymbolNo;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }



}
