package Pluto.BankingExercise;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        if (initialTransaction > 0) {
            this.name = name;
            transactions = new ArrayList<>();
            transactions.add(initialTransaction);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
            transactions.add(transaction);
    }
}
