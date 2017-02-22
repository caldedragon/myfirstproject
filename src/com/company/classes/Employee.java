package com.company.classes;

/**
 * Created by JPMC-PC02 on 2/17/2017.
 */
public class Employee extends Person {

    String Department;
    String Paygrade;
    String EmployeeID;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getPaygrade() {
        return Paygrade;
    }

    public void setPaygrade(String paygrade) {
        Paygrade = paygrade;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }


    public String introduceYourself( String fname,String lname ,int age, int telnum, float Msalary){ return
           "Hello i am "+ fname +" "+ lname + " Employee my age is " + age +" please contact me here "+ telnum +" my monthly salary is " + Msalary; }




}
