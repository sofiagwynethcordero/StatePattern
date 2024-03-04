package StatePattern;

public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public void suspend(){
        accountState.suspend(this);
    }
    public void activate(){
        accountState.activate(this);

    }
    public void close(){
        accountState.close(this);

    }
    public void deposit(Double despositAmount){
        accountState.deposit(despositAmount, this);
    }
    public void withdraw(Double withdrawAmount){
        accountState.withdraw(withdrawAmount, this);
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public Double getBalance(){
        return balance;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public void setState(AccountState accountState){
        this.accountState = accountState;
    }
    public String toString(){
        return "Account number: " + accountNumber + " \nBalance: " + balance;
    }
}
