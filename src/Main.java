import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name Balance Password");

        String name = sc.next();
        String password = sc.next();
        Double balance= sc.nextDouble();

        SBIUser user = new SBIUser(name,balance,password);
        // Add Money
        String message=user.addMoney(10000);
        System.out.println(message);

        //WithDraw Money
        System.out.println("Enter the amount to withdraw");
        int money= sc.nextInt();
        System.out.println("Enter the Password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        // rate of Interest

        System.out.println("Interest is : " +user.calculateInterest(10));



    }
}