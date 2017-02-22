package com.company;

import com.company.classes.Customer;
import com.company.classes.Employee;
import com.company.classes.Person;
import com.company.classes.StaticMethods;

public class Main {

    public static void main(String[] args) {

        Person firstUser = new Person();
        Employee firstemployer = new Employee();
        //Customer costumer = new Customer();

        Customer ncustomer = new Customer("fcustomer","lcustomer",10000);
        //ncustomer.getFname();
        //ncustomer.getLname();



        firstUser.setFirstuser("cal");
        firstUser.setAge(1);
        firstUser.setPassword("***");
        firstUser.setFname("cal");
        firstUser.setLname("dragon");
        firstUser.setEmail("dragon@yahoo.com");

        // extending code
        // create my first employee for first person user


        firstemployer.setDepartment("Alpha");
        firstemployer.setPaygrade("100");
        firstemployer.setEmployeeID("ID-0001");

// create my Customer


        ncustomer.setAddress("Colon Street");
        ncustomer.setTelNum("(032) 666-6666");
        ncustomer.setCostumerID("ID-00003");


        //Person secUser = new Person();
        //secUser.setSecuser("jak");
        //secUser.setAge(33);
        //secUser.setPassword("9999");


        System.out.println("-------PERSON 1--------");

        String firstName = firstUser.getFirstuser();
        String firstEmployer = firstemployer.getDepartment();
        String firstCostumer = ncustomer.getAddress();

        System.out.println("User 1: " + firstName);
        System.out.println("Age: " + firstUser.getAge());
        System.out.println("Password: "+ firstUser.getPassword());
        System.out.println("First Name: "+ firstUser.getFname());
        System.out.println("Last Name: "+ firstUser.getLname());
        System.out.println("Email: " + firstUser.getEmail()+ "\n");

        // output for the first employeer

        System.out.println("EMPLOYER: "+ firstEmployer);
        System.out.println("PAY GRADE: "+ firstemployer.getPaygrade());
        System.out.println("PAY GRADE: "+ firstemployer.getEmployeeID()+ "\n \n");


        //OUTPUTS
        //output for the customer



        System.out.println("Address :"+ firstCostumer);
        System.out.println("Telephone :"+ ncustomer.getTelNum());
        System.out.println("Telephone :"+ ncustomer.getCostumerID());


        System.out.println ("INTRODUCE SELF: "+ firstUser.getFname() +" "+ firstUser.getLname() + "\n");
       // System.out.println ( firstUser.getFirstuser() +"-"+ firstemployer.getDepartment());


        System.out.println (firstUser.introduceYourself("Hello Im "+"cal","dedragon"));
        System.out.println(ncustomer.introduceYourself("kilo" ,"Lima",300001 ));
        System.out.println(firstemployer.introduceYourself("Joe" ,"Lima",33,411111,1312312.342582937f));

        System.out.println("\n");

        System.out.println(ncustomer.getFname() +" "+ ncustomer.getLname()+" mao ni akong salary ra " + ncustomer.getCsalary());

//output for the customer




        //System.out.println("\n-------PERSON 2--------");

        //String secondName = secUser.getSecuser();

        //System.out.println("Person 2: " + secondName);
        //System.out.println("Age: " + secUser.getAge());
        //System.out.println("Password: "+ secUser.getPassword()+ "\n");


        System.out.println(" LOOP ___________ EXERCISE \n \n");

       // int[] a = new int[10];
        int a = 1;

        System.out.println(" WHILE \n \n");
        while (a < 11){
System.out.print("["+ a +"]"); a++;

        }
      a =1;
        System.out.println("\n\n DOWHILE \n\n");

        do{ System.out.print("["+ a++ +"]");

        } while (a <= 10);

        System.out.println("\n\n FOR LOOPS \n\n");
            for (a=1;a<11;a++){
                System.out.print("["+ a + "]");
            }

        System.out.println("\n\n GET THE SUM \n");

        System.out.print("The Sum is: " + StaticMethods.forloops(7));


        System.out.println("\n\n GET THE SUM \n");

        System.out.print("Factorial of " + StaticMethods.factorial(0));


//dsafasf





	// write your code here
    }
}
