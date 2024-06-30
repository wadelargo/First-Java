public class AccountApp {
    public static void main(String[] args) {
        AccountsLinkedList listOfAccounts = new AccountsLinkedList();

        listOfAccounts.addToTail(new Account("Pamela", 25600));
        listOfAccounts.addToTail(new Account("Jameson", 28900));
        listOfAccounts.addToTail(new Account("Pamela", 32400));
        listOfAccounts.addToTail(new Account("Pamela", 11300));
        listOfAccounts.addToTail(new Account("Pamela",67600));

        listOfAccounts.showData();
        System.out.println("Total Deposits: " + listOfAccounts.sumBalance());

        System.out.println("Highest depositor: ");
        Account hd = listOfAccounts.highest();
        System.out.println("Name: " + hd.getName());
        System.out.println("Balance: " + hd.getBalance());
    }
}
