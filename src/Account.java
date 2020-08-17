import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account extends Customer{
    long accountNumber;
    String PAN;
    private List <Account> accountList;

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", PAN='" + PAN + '\'' +
                ", bank_reg_no=" + bank_reg_no +
                ", customerID=" + customerID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mobileNumber=" + mobileNumber +
                ", address='" + address + '\'' +
                '}';
    }
//  empty constructor
    public Account(){
    }
// to initiate class variables in object
    public Account(int customerID, long accountNumber, String PAN){
        this.customerID=customerID;
        this.accountNumber=accountNumber;
        this.PAN=PAN;
    }
//method to store objects in Arraylist
    void addAccount(){
        Customer customer=new Customer();
        List<Customer> customerList=customer.getCustomer();
        accountList=new ArrayList<>();
        Scanner accountInput=new Scanner(System.in);
        System.out.println("enter number customer you have added");
        int temp=accountInput.nextInt();
        for(int i=0;i<temp;i++) {
                System.out.println("enter AccountNumber "+i);
                accountNumber=accountInput.nextLong();
                System.out.println("enter PAN");
                PAN=accountInput.next();
                accountList.add(new Account(i, accountNumber, PAN));
        }
        for(int i=0;i<accountList.size();i++){
            System.out.println("Account "+i+" details");
            System.out.println(accountList.get(i));
            System.out.println(customer.customerList.get(i).name);
        }
        System.out.println(accountList.size()+" Accounts were added");
    }
}