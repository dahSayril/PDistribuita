/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.job;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author sigci
 */

@Entity
public class Job implements Serializable {
    
    public Job() {
        title = "";
        salary = 0;
        employeeld = "";
    }
    
    public Job(String title, float salary, String employeeld) {
        this.title = (title == null) ? "" : title;
        this.salary = salary;
        this.employeeld = (employeeld == null) ? "" : employeeld;
    }
    
    public long getId() { return id; }
    
    public void setId(long id) { this.id = id; }
    
    public String getTitle() { return title; }
    
    public void setTile(String title) { this.title = (title == null) ? "" : title; }
    
    public float getSalary() { return salary; }
    
    public void setSalary(float salary) { this.salary = salary; }
    
    public String getEmployeeld() { return employeeld; }
    
    public void setEmployeeld(String employeeld) { this.employeeld = (employeeld == null) ? "" : employeeld; }
    
    public Company getCompany() { return company; }
    
    public void setCompany(Company company) { this.company = company; }
    
    public Person getPerson() { return person; }
    
    public void setPerson(Person person) { this.person = person; }
    
    public String toString() {
        return getClass().getCanonicalName() + "[title=" + title
                + ", salary=" + salary + ", employeeld=" + employeeld + "]";
    } 
    
    @Id @GeneratedValue
    private long id;
    private String title;
    private float salary;
    private String employeeld;
    @ManyToOne
    @JoinColumn(name = "company")
    public Company company;
    @ManyToOne
    @JoinColumn(name = "person")
    public Person person;
    
}