import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    List<Double> transactions = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getAccountBalance(){
        double balance = 0;
        for (int i = 0; i < this.transactions.size(); i++) {
            balance += this.transactions.get(i);
        }
        return balance;
    }
}
