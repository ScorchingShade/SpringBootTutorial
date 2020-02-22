package com.reddragon.practice.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *@anksh
 * This is a class which will be dependent on the Company class.
 * The company class will be injected with setter injection.
 */
@Component
public class Employee {
    int empId;
    String name;
    String address;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    //Autowired is used so that this class recognises that there is another class called company and we have its use here
    //basically it makes the Employee class here recognise the Company class object as a bean whose dependency will be injected by Spring.
    @Autowired
    Company company;


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        //here we can see that the company object was intantiated by not creating an instance, rather using setter to initialise it
        //Finally we get the value using a getter.
        //in normal java, we would have had to first create an object, then initialise it, then set its value.
        //This makes the class unspecialised as it has to also initialise some other class's object by first creating an instance of it
        //The dependency injection of spring means that all instances will be created by springContainer and whereEver needed we can get it without creating an instance ourselves
        company.setCompanyId(12309);
        return "This is the springiest day of my life, well the companyId is => "+company.getCompanyId();
    }

}
