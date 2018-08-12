import java.util.ArrayList;
import java.util.List;

public class Bank {

    public List<Customer> customerList;

    public Bank() {
        this.customerList = new ArrayList<>();
    }


    public Customer findBankCustomer(String customerName) {
        for (int i = 0; i < this.customerList.size(); i++) {
            Customer checkingCustomer = this.customerList.get(i);
            if (checkingCustomer.getName().equals(customerName)) {
                return checkingCustomer;
            }
        }
        return null;
    }

    public boolean newBankCustomer(String customerName, int initialBalance) {
        if (findBankCustomer(customerName) == null) {
            customerList.add(new Customer(customerName, initialBalance));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, int amount) {
        Customer existingCustomer = findBankCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public void listCustomers(boolean showBalance) {
        System.out.println("List of all customers: ");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.print(i + 1 + ". " + customerList.get(i).getName());
            if(showBalance){
                System.out.print("'s balance: " + customerList.get(i).getBalance());
            }
            System.out.println();
        }
        System.out.println("End of list.");
    }

}
