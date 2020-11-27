/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.job;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
    @NamedQuery(name = "FindAllCompany", query = "SELECT c FROM Company c")
})
public class Company implements Serializable {
    
    public Company() {
        name = "";
    }
    
    public Company(String name) {
        this.name = (name == null) ? "" : name;
    }
    
    public String getName() { return name; }
    
    public void setName(String name) { this.name = (name == null) ? "" : name; }
    
    public Address getAddress() { return address; }
    
    public void setAddress(Address address) { this.address = address; }
    
    public List <Job> getJobs() { return jobs; }
    
    @Override
    public String toString() { 
        return getClass().getCanonicalName() + "[id=" + id + ", name=" + name
                + ", address=" + address + "]";
    }
    
    @Id @GeneratedValue
    private long id;
    @Column(nullable = false, length = 50)
    private String name;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address")
    private Address address;
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List <Job> jobs;
    
}
