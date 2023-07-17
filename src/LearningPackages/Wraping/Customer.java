package LearningPackages.Wraping;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
        transactions = new ArrayList<>();
    }

    public void addTransaction(Double amount){
        transactions.add(amount);
    }

    public void printTransactions(){
        System.out.println("transactions:");
        int index = 1;
        for (double d: transactions) {
            System.out.printf("%d : %.2f%n", index++, d);

        }
    }
}
