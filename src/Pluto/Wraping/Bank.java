package Pluto.Wraping;

import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    private int findCustomer(String name){
        int index = 0;
        for (Customer c: customers) {
            if(c.getName().equals(name)){

                return index;
            }
            index++;
        }
        return -1;
    }

    public boolean addCustomer(String name){
        if(findCustomer(name) == -1){
            customers.add(new Customer(name));
            System.out.println("Added " + name);
            return true;
        }
        System.out.println(name + " already is in the system");
        return false;
    }


    public boolean addTransaction(String name, double amount){
        int customerId = findCustomer(name);
        if(customerId != -1){
            customers.get(customerId).addTransaction(amount);
            return true;
        }
        return false;
    }

    public void printCustomer(String name){
        int customerId = findCustomer(name);
        if(customerId != -1){
            System.out.println("Name: " + customers.get(customerId).getName());
            customers.get(customerId).printTransactions();

        }
        else{
            System.out.println("User has not been found");
        }
    }
}
