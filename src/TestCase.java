import java.util.ArrayList;
import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        System.out.println("Do you want to add customer?");
        Scanner S=new Scanner(System.in);
        String add=S.next();
        int noc;
        ArrayList<Customer> Customers =new ArrayList<Customer>();
        if (add.equals("yes")){
            System.out.println("Enter number of customers you want to add.");
            noc=S.nextInt();
            for(int i=0;i<noc;i++) {
                System.out.println("enter name");
                Customer.Name=S.next();
                System.out.println("enter mobile number");
                Customer.Mob_No=S.nextInt();
                System.out.println("enter address");
                Customer.Address=S.next();
                Customer C1 = new Customer(Customer.Name, Customer.Mob_No, Customer.Address);
                Customers.add(C1);
            }
        }
        else{
            System.out.println("EXIT");
        }
        System.out.println("1rst Customer");
        System.out.println(Customers.get(0).Name);
        System.out.println(Customers.get(0).Mob_No);
        System.out.println(Customers.get(0).Address);
        System.out.println("2nd Customer");
        System.out.println(Customers.get(1).Name);
        System.out.println(Customers.get(1).Mob_No);
        System.out.println(Customers.get(1).Address);
    }
}
