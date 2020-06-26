package udemy_exercises.bank;

public class Bank {

    private String name;
    private ArrayList<Branches> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branches>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;

    }

    private Branch findBranch(String branchName) {
        for int(i = 0); i < branches.size(); i++) {
            Branch checkBranch = this.branches.get(i);
            if (checkBranch.getName().equals(branchName)) {
                return checkBranch;
                }
            return null;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, intialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }
    
    public boolean dispalyCustomers(Strinb branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println ("Customers in branch " + branch.getName());
            
            ArrayList<Customers> branchCustomers = branch.getCustomers();
            
            for (int = 0; i < branchCustomers(); i++) {
                Customer branchCustomer = branchCustomer.get(i);
                System.out.println("Customer Name: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount: " + transactions.get(j));
                    }
                }
                
                return true;
            }
            
            else {
                return false;
            }
        }
        
        return false;
        
    }
    
}


/*
**Banking w/ Java Classes**
   - **Bank class**
      - List of Branches
      - Add a new branch
      - Add a customer to that branch with initial transaction
      - Add a transaction for an existing customer for that branch
      - Show a list of customers for a particular branch and optionally a list of their transactions
   - Demonstration autoboxing and unboxing in your code
   - Think about where you are adding the code to perform certain actions
   - **Branch class**
     - List of Customers
     - List of Transactions
   - **Customer Class**:
     - Customer Name
   - **Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
   - **Bank:**
     
*/