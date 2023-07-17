package LearningPackages.BankingExercise;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction){

        if(findCustomer(name) != null || initialTransaction <= 0){
            return false;
        }
        customers.add(new Customer(name, initialTransaction));
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer customer = findCustomer(name);
        if(customer == null || transaction <= 0){
            return false;
        }
        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name){
        for (Customer c:customers) {
            if(c.getName().equals(name)){
                return c;
            }

        }
        return null;
    }
}
