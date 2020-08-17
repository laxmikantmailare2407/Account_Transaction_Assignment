import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer extends firstBank {
    List<Customer> customerList;

    public int noc;


    // add tiString method to print object
    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mobileNumber=" + mobileNumber +
                ", address='" + address + '\'' +
                '}';
    }
//    empty constructor
    public Customer(){
    }
//    constructor to call variables
    public Customer(int customerID, String name,int age, long mobileNumber, String address) {
        this.customerID=customerID;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.age=age;
    }
// method to add customer and store it in arraylist
    public void addCustomer() {
        customerList = new ArrayList<>();
        Scanner customerInput = new Scanner(System.in);
        System.out.println("How many customer do you want to add");
        noc=customerInput.nextInt();
        for(int i=0;i<noc;i++) {
            customerID=i;
            System.out.println(i+". enter name");
            name = customerInput.next();
            System.out.println(i+". enter age");
            age = customerInput.nextInt();
            System.out.println(i+". enter mobile number");
            mobileNumber = customerInput.nextLong();
            System.out.println(i+". enter address");
            address = customerInput.next();
            customerList.add(new Customer(customerID, name, age, mobileNumber, address));
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