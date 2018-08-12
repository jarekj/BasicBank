import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    List<Integer> transactions;

    public Customer(String name, int initialBalance) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialBalance);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getTransactions() {
        return transactions;
    }

    public int getBalance(){
        int balance = 0;
        for (int i = 0; i < transactions.size(); i++) {
            balance += transactions.get(i);
        }
        return balance;
    }

    public void addTransaction(int amount) {
        this.transactions.add(amount);
    }

}
