package Pluto.BankingExercise;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) != null)
            return false;

        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(
            String branchName,String customerName,
            double initialTransaction
    ){
        Branch b = findBranch(branchName);
        if(b == null)
            return false;
        return b.newCustomer(customerName, initialTransaction); //true or false


    }


    public boolean addCustomerTransaction(
            String branchName,String customerName,
            double transaction
    ){
        Branch b = findBranch(branchName);
        if(b == null)
            return false;
        return b.addCustomerTransaction(customerName, transaction); //true or false


    }

    private Branch findBranch(String name){
        for (Branch b:branches
             ) {
            if(b.getName().equals(name))
                return b;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean print){
        Branch b = findBranch(branchName);
        if(b == null)
            return false;

        System.out.println("Customer details for branch " + b.getName());

            int i = 1;
            for (Customer c: b.getCustomers()) {
                System.out.println("Customer: "+ c.getName() + "[" + i++ + "]");
                if(print){
                    System.out.println("Transactions");
                    int j = 1;
                    for(double t:c.getTransactions()){

                        System.out.println("[" + j++ + "]  Amount " + t);
                    }
                }

            }
        return true;


    }
}
