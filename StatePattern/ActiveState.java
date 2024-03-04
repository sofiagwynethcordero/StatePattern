package StatePattern;

public class ActiveState implements AccountState{

    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("Old Balance: " + account.getBalance() + " Deposited Amount: " + depositAmount);
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Account Deposited");
        account.toString();
    }

    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("Old Balance: " + account.getBalance() + " Withdrawn Amount: " + withdrawAmount);
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Account Withdraw");
        account.toString();
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is suspended!");
        account.setState(new SuspendedState());
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
