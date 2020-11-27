/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.job;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author sigci
 */

@Entity
public class Address implements Serializable {
    
    public Address() {
        street1 = "";
        street2 = "";
        city = "";
        stat = "";
        zip = "";
    }
    
    public Address(String street1, String street2, String city,
            String stat, String zip) {
        this.street1 = (street1 == null) ? "" : street1;
        this.street2 = (street2 == null) ? "" : street2;
        this.city = (city == null) ? "" : city;
        this.stat = (stat == null) ? "" : stat;
        this.zip = (zip == null) ? "" : zip;
    }
    
    public String getStreet1() { return street1; }
    
    public void setStreet1(String street1) { this.street1 = (street1 == null) ? "" : street1; }
    
    public String getStreet2() { return street2; }
    
    public void setStreet2(String street2) { this.street2 = (street2 == null) ? "" : street2; }
    
    public String getCity() { return city; }
    
    public void setCity(String city) { this.city = (city == null) ? "" : city; }
    
    public String getStat() { return stat; }
    
    public void setStat(String stat) { this.stat = (stat == null) ? "" : stat; }
    
    public String getZip() { return zip; }
    
    public void setZip(String zip) { this.zip = (zip == null) ? "" : zip; }
       
    @Override
    public String toString() {
        return getClass().getCanonicalName() + "[id=" + id + ", street1=" + street1 
                + ", street2=" + street2 + ", city=" + city + ", stat=" + stat
                + ", zip=" + zip + "]";
    }
    
    @Id @GeneratedValue
    private long id;
    private String street1;
    private String street2;
    private String city;
    private String stat;
    private String zip;
    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    private Company company;
    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    private Person person;
    
}
