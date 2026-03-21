package org.example;

class Bank {

    private String customerName;
    private int customerId;
    private float balanceAmount;

    public float getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(float balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}

public class EncapsulationRe {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setCustomerName("John");
        bank.setCustomerId(1001);
        bank.setBalanceAmount(10.0F);

        System.out.println("The customer details are " + bank.getCustomerName() + " " +bank.getCustomerId());
    }
    /*Data binding or Data hiding --> Encapsulation

    class --> private variables --> accessible only inside that particular class
    getters and setters
    --> Encapsulation
     */


}
