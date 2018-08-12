public class Main {

    public static void main(String[] args) {


        Customer j = new Customer("Jarek");

        System.out.println(j.toString());

        j.deposit(100);

        System.out.println(j.toString());

        j.deposit(20);

        System.out.println(j.toString());

        j.withDraw(120);

        System.out.println(j.toString());

    }
}
