package org.example;

public class Main {
    public static void main(String[] args) {
        Bank account1 = new Bank("Dewey", 5000.0);
        Bank account2 = new Bank("Tyler", 300.0);
        account1.withdraw(100.0);
        account2.deposit(100.0);
        System.out.println("Account1 Details: ");
        account1.printAccountDetails();
        System.out.println(account1);

        System.out.println("Account2 Details: ");
        account2.printAccountDetails();
        System.out.println(account2);


        Product product = new Product("Desktop", 1236.99, 2);
        product.printProduct();
        product.totalCost();
    }


}
