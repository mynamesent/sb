/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.mfec.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Sent
 */

@Entity
@Table(name="person")
public class Person implements Serializable{
    
    @Id   
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "fname")
    String fname;
    @Column(name = "lname")
    String lname ; 

    public Person() {
    }

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
    
    
    
    
    
    
}
