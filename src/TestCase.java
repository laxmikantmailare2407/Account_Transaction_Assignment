import java.util.ArrayList;
import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        System.out.println("Do you want to add customer? yes/no");
        Scanner S=new Scanner(System.in);
        String add=S.next();
        if (add.equals("yes")){
            Customer customer=new Customer();
            customer.addCustomer();
        }
        else{
            System.out.println("EXIT");
        }
    }
}
