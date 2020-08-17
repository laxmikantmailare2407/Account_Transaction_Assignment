import java.util.ArrayList;
import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        System.out.println("Do you want to add new customer? yes/no");
        Scanner mainInput=new Scanner(System.in);
        String add=mainInput.next();
        if (add.equals("yes")){
            firstBank xyz=new firstBank();
            xyz.addCustomer();
            System.out.println("Do you want to add account for a customer? yes/no");
            add=mainInput.next();
            if(add.equals("yes")){
                xyz.addAccount();
            }
        }
        else{
            System.out.println("EXIT");
        }
    }
}
