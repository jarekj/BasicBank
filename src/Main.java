import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.newBankCustomer("Jarek", 0);
        bank.newBankCustomer("Barbara", 500);
        bank.newBankCustomer("Jurek", 300);
        bank.newBankCustomer("Czesia", 999);
        bank.listCustomers(true);

        bank.addCustomerTransaction("Jarek", 100);

        bank.listCustomers(true);

    }
}
