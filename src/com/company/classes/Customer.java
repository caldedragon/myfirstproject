package com.company.classes;

/**
 * Created by JPMC-PC02 on 2/17/2017.
 */
public  class Customer extends Person {

    String address;
    String telNum;
    String costumerID;

    int csalary;

    public int getCsalary() {
        return csalary;
    }

    public void setCsalary(int csalary) {
        this.csalary = csalary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getCostumerID() {
        return costumerID;
    }

    public void setCostumerID(String costumerID) {
        this.costumerID = costumerID;
    }

    public String introduceYourself( String fname,String lname, int costuID ){ return
         "I am  "+   fname +" "+ lname + " my costumer ID is "+ costuID ; }


   // public Customer(){
   // }



    public Customer(String fname, String lname, int csalary ){
        this.fname = fname;
        this.lname = lname;
        this.csalary = csalary;
    }



}
