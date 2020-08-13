import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account extends XYZBank{
    long accountNumber;
    String PAN;
    private List <Account> accountList;

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", PAN='" + PAN + '\'' +
                ", bank_reg_no=" + bank_reg_no +
                ", CID=" + CID +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", Mob_No=" + Mob_No +
                ", Address='" + Address + '\'' +
                '}';
    }

    public Account(){
    }

    public Account(int CID, long accountNumber, String PAN){
        this.CID=CID;
        this.accountNumber=accountNumber;
        this.PAN=PAN;
    }

    void addAccount(){
        List<Customer> c_accountList=new Customer().getCustomer();
        accountList=new ArrayList<>();
        Scanner sa=new Scanner(System.in);
        System.out.println("enter number customer you have added");
        int temp=sa.nextInt();
        for(int i=0;i<temp;i++) {
                System.out.println("enter AccountNumber "+i);
                accountNumber=sa.nextLong();
                System.out.println("enter PAN");
                PAN=sa.next();
                accountList.add(new Account(i, accountNumber, PAN));
        }
        for(int i=0;i<accountList.size();i++){
            System.out.println("Account "+i+" details");
            System.out.println(accountList.get(i));
        }
        System.out.println(accountList.size()+" Accounts were added");
    }
}