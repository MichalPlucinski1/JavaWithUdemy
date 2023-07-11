package Pluto.Wraping;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("MBANK");

        bank.addCustomer("Michael");
        bank.addCustomer("Thomas");
        bank.addCustomer("Leila");
        bank.addCustomer("Michael");

        bank.addTransaction("Michael", 50.0);

        bank.addTransaction("Michael", -60);

        bank.printCustomer("Michael");
    }
}
