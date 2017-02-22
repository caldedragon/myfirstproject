package com.company.classes;

/**
 * Created by JPMC-PC02 on 2/17/2017.
 */
public class Person {

    String firstuser;
    String secuser;

    String email;
    String fname;
    String lname;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getSecuser() {
        return secuser;
    }

    public void setSecuser(String secuser) {
        this.secuser = secuser;
    }

    String password;

    int age;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstuser() {
        return firstuser;
    }

    public void setFirstuser(String firstuser) {
        this.firstuser = firstuser;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String introduceYourself( String fname,String lname){ return
            fname +" "+ lname; }





}



