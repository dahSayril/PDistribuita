/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.job;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author sigci
 */

@Entity
@NamedQueries({
    @NamedQuery(name = "FindAllPerson", query = "SELECT p FROM Person p")
})
public class Person implements Serializable {
       
    public Person() {
        firstName = "";
        lastName = "";        
    }
    
    public Person(String firstName, char middleInitial, String lastName) {
        this.firstName = (firstName == null) ? "" : firstName;
        this.middleInitial = middleInitial;
        this.lastName = (lastName == null) ? "" : lastName;
    }
    
    public String getFirstName() { return firstName; }
    
    public void setFirstName() { this.firstName = (firstName == null) ? "" : firstName; }
    
    public char getMiddleInitial() { return middleInitial; }
    
    public void setMiddleInitial(char middleInitial) { this.middleInitial = middleInitial; }
    
    public String getLastName() { return lastName; }
    
    public void setLastName(String lastName) { this.lastName = (lastName == null) ? "" : lastName; }
    
    public Address getAddress() { return address; }
    
    public void setAddress(Address address) { this.address = address; }
    
    @Override
    public String toString() {
        return getClass().getCanonicalName() + "[fistName=" + firstName
                + ", middleInitial=" + middleInitial + ", lastName=" + lastName + "]";
    }
    
    @Id @GeneratedValue
    private long id;
    private String firstName;
    private char middleInitial;
    private String lastName;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address")
    private Address address;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "person")
    private List <Job> job;
    
}
