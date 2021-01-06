package BankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount firstAccount = new BankAccount("Bijay Sedhain", 50000);
        BankAccount secondAccount = new BankAccount("Sanjeev Sedhain", 0);

        System.out.println("Statement: \n" +
                "Name:"+ firstAccount.getName()+"\t\t" + firstAccount.getBalance() +"\n" +
                "Name:"+ secondAccount.getName()+"\t\t" + secondAccount.getBalance());

        firstAccount.diposit(20000);
        secondAccount.diposit(100000);

        System.out.println();

        System.out.println("After Deposit in both Account.");
        System.out.println("Statement: \n" +
                "Name:"+ firstAccount.getName()+"\t\t" + firstAccount.getBalance() +"\n" +
                "Name:"+ secondAccount.getName()+"\t" + secondAccount.getBalance());

        firstAccount.diposit(20000, 12);
        secondAccount.diposit(100000, 13);

        System.out.println();

        System.out.println("After Deposit in both Account with interest.");
        System.out.println("Statement: \n" +
                "Name:"+ firstAccount.getName()+"\t\t" + firstAccount.getBalance() +"\n" +
                "Name:"+ secondAccount.getName()+"\t" + secondAccount.getBalance());

        firstAccount.withdraw(15000);
        secondAccount.withdraw(20000);
        System.out.println();

        System.out.println("After Withdrawing in both Account.");
        System.out.println("Statement: \n" +
                "Name:"+ firstAccount.getName()+"\t\t" + firstAccount.getBalance() +"\n" +
                "Name:"+ secondAccount.getName()+"\t" + secondAccount.getBalance());

        firstAccount.withdraw(15000, 12);
        secondAccount.withdraw(20000, 13);

        System.out.println();

        System.out.println("After Withdrawing in both Account with interest.");
        System.out.println("Statement: \n" +
                "Name:"+ firstAccount.getName()+"\t\t" + firstAccount.getBalance() +"\n" +
                "Name:"+ secondAccount.getName()+"\t" + secondAccount.getBalance());
    }


}
