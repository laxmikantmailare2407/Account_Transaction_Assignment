import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    static int CID;
    static String Name;
    static int Mob_No;
    static String Address;

    public static void main(String[] args) {

    }
    public Customer(String Name, int Mob_No, String Address) {
        this.Name = Name;
        this.Mob_No = Mob_No;
        this.Address = Address;
    }

    public static void addCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        Name=sc.next();
        System.out.println("enter mobile number");
        Mob_No=sc.nextInt();
        System.out.println("enter address");
        Address=sc.next();
        Customer C1 = new Customer(Name, Mob_No, Address);
    }
}