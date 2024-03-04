package StatePattern;

public class ClosedState implements AccountState{
    public void deposit(Double depositAmount, Account account){
        System.out.println("You cannot deposit to a closed account!");
        account.toString();
    }

    public void withdraw(Double withdrawAmount, Account account){
        System.out.println("You cannot withdraw to a closed account!");
        account.toString();
    }

    public void suspend(Account account){
        System.out.println("You cannot suspend a closed account!");
    }

    public void activate(Account account){
        System.out.println("You cannot activate a closed account!");
    }

    public void close(Account account){
        System.out.println("Account is already closed!");
    }
}
