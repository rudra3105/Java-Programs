class BankAccount {
    static int acc_number = 1;
    String name;
    int acc_no;
    String acc_type;
    double balance;

    void createAcc(String n, String a_t) {
        name = n;
        acc_no = acc_number;
        acc_type = a_t;
        balance = 0.0;
        acc_number++;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void balanceInquiry() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Type: " + acc_type);
        System.out.println("Balance: " + balance);
    }
}