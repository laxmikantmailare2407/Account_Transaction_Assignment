public abstract class Bank {
    private int bank_reg_no;
    private  String IFSC_code;

    abstract void addCustomer();
    abstract void addAccount();
    abstract void makeTransactions();

}
