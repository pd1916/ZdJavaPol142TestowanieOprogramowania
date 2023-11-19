package pl.sdacademy.unit.test.exercises.day1.tdd.task3;

import java.util.Objects;

public class Account {
    private float balance;
    private final String accountNumber;
    private final Customer customer;

    public Account(float balance, String accountNumber, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customer = customer;
    }

    public void transferMoney(Account creditAccount, float amount) {
        if(validateAccountNumber(creditAccount)
                && validateAccountNumber(this)
                && validateAmount(amount)) {
            this.setBalance(this.getBalance() - amount);
            creditAccount.setBalance(creditAccount.getBalance() + amount);
        }
    }

    private boolean validateAmount(float amount) {
        //rzucenie wyjątkiem?
        if(amount <= 0 || amount > this.getBalance()) {
            System.out.println("Wrong amount: " + amount + " ,actual balance: " + this.getBalance());
            return false;
        }
        return true;
    }

    private static boolean validateAccountNumber(Account account) {
        //rzucenie wyjątkiem?
        if (account.getAccountNumber().length() != 26
                || !account.getAccountNumber().matches("[0-9]*")) {
            System.out.println("Wrong account number: " + account.getAccountNumber());
            return false;
        }
        return true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    private void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Float.compare(balance, account.balance) == 0 && Objects.equals(accountNumber, account.accountNumber) && Objects.equals(customer, account.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, accountNumber, customer);
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", customer=" + customer +
                '}';
    }
}