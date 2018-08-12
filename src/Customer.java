import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    List<Integer> transactions = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAccountBalance() {
        int balance = 0;
        for (int i = 0; i < this.transactions.size(); i++) {
            balance += this.transactions.get(i);
        }
        return balance;
    }

    public void deposit(int deposit) {
        if (deposit >= 0) {
            transactions.add(deposit);
            System.out.println("Deposited to " + name + "'s account "+ deposit + "$.");
        } else {
            System.out.println("You can not deposit negative number of dollars.");
        }
    }

    public void withDraw(int withDraw) {
        if (getAccountBalance() < withDraw) {
            System.out.println("Trying to withdraw: " + withDraw + "$ from " + name + "'s account.");
            System.out.println("Error: Insufficient funds. You can withdraw no more than " + getAccountBalance() + "$.");
        } else {

            if (withDraw < 0) {
                System.out.println("You can not withdraw negative number of dollars");
            } else {
                transactions.add(-withDraw);
                System.out.println("Trying to withdraw: " + withDraw + "$ from " + name + "'s account.");
                System.out.println(withDraw + "$ withdrawn from " + name + "'s account.");
                System.out.println(this.name + "'s balance after withdraw: " + getAccountBalance());
            }
        }
    }

    @Override
    public String toString() {
        return "Customer: " +
                "name: " + name +
                ", balance: " + getAccountBalance() +
                "$.";
    }
}
