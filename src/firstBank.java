import java.util.List;

public class firstBank extends Bank {
    int bank_reg_no=123456;
    int customerID;
    String name;
    int age;
    long mobileNumber;
    String address;

    @Override
    void addCustomer() {
        System.out.println("adding customer for first Bank.");
        Customer customer=new Customer();
        customer.addCustomer();
    }

    @Override
    void addAccount() {
        System.out.println("adding accounts for First Bank Customers");
        Account account=new Account();
        account.addAccount();

    }

    @Override
    void makeTransactions() {

    }
}
