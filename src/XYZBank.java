import java.util.List;

public class XYZBank extends Bank {
    int bank_reg_no=123456;
    int CID;
    String Name;
    int age;
    long Mob_No;
    String Address;

    @Override
    void addCustomer() {
        System.out.println("adding customer for XYZ Bank.");
        Customer customer=new Customer();
        customer.addCustomer();
    }

    @Override
    void addAccount() {
        System.out.println("adding accounts for XYZ Bank Customers");
        Account account=new Account();
        account.addAccount();

    }

    @Override
    void makeTransactions() {

    }
}
