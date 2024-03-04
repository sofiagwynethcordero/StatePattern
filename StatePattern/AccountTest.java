package StatePattern;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0);

        myAccount.activate();

        myAccount.suspend();

        myAccount.activate();

        myAccount.deposit(1000.0);
        System.out.println();
        System.out.println(myAccount.toString());

        myAccount.withdraw(100.0);
        System.out.println();
        System.out.println(myAccount.toString());

        myAccount.close();

        myAccount.activate();

        myAccount.suspend();

        myAccount.withdraw(500.0);
        System.out.println();
        System.out.println(myAccount.toString());

        myAccount.deposit(1000.0);
        System.out.println();
        System.out.println(myAccount.toString());
    }
}
