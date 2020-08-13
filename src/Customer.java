import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer extends XYZBank {
    private List<Customer> customerList;
    public int noc;


    // add tiString method to print object
    @Override
    public String toString() {
        return "Customer{" +
                "CID=" + CID +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", Mob_No=" + Mob_No +
                ", Address='" + Address + '\'' +
                '}';
    }
//    empty constructor
    public Customer(){
    }
//    constructor to call variables
    public Customer(int CID, String Name,int age, long Mob_No, String Address) {
        this.CID=CID;
        this.Name = Name;
        this.Mob_No = Mob_No;
        this.Address = Address;
        this.age=age;
    }
// method to add customer and store it in arraylist
    public void addCustomer() {
        customerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many customer do you want to add");
        noc=sc.nextInt();
        for(int i=0;i<noc;i++) {
            CID=i;
            System.out.println(i+". enter name");
            Name = sc.next();
            System.out.println(i+". enter age");
            age = sc.nextInt();
            System.out.println(i+". enter mobile number");
            Mob_No = sc.nextLong();
            System.out.println(i+". enter address");
            Address = sc.next();
            customerList.add(new Customer(CID, Name, age, Mob_No, Address));
        }
//        to show customer
        for(int i=0; i<customerList.size(); i++){
            System.out.println("Customer: "+i +" details");
            System.out.println(customerList.get(i));
        }
        System.out.println(noc+" customers were added.");
    }
//    method to getCustomers
    public List<Customer> getCustomer(){
        return customerList;
    }
}