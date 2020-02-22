package com.reddragon.practice.beans;

import org.springframework.stereotype.Component;

/**
 * @author anksh
 * This class is the service class that is providing injection to the Employee class
 */
@Component
public class Company {

    int companyId;
    String companyName;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


}
