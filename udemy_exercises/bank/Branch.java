package bank;

import java.util.ArrayList;

public class Branch {
    
    private String name;
    private Array<Customers> customers;
    private ArrayList<Double> transactions;
    
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customers>();
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    
    public boolean newCustomer (String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        
        return false;
    }
    
    public boolean addTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        
        return false;
        
    }
    
    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkName = this.customers.get(i);
            if (checkName.get().getName().equals(CustomerName)) {
                return checkName;
            }
        }
        
        return null;
    }
}

/*
**Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
*/

