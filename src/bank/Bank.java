package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        ArrayList<AccountDetails> acc = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Bank obj = new Bank();

        while(true) {
            System.out.println("\n0)----->Exit");
            System.out.println("1)----->Create Account");
//            System.out.println("2)----->Deposit");
//            System.out.println("3)----->Withdraw");
//            System.out.println("4)----->Check Balance");
            System.out.print("ENTER THE CHOICE : ");
            int choice = sc.nextInt();

            switch(choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Enter Applicant's name : ");
                    String name = sc.next();
                    System.out.print("Enter Applicant's Aaadhar number : ");
                    int aadhaarnum = sc.nextInt();
                    System.out.print("Enter email id : ");
                    String email = sc.next();
                    System.out.print("Enter contact number : ");
                    int contact_num = sc.nextInt();

                    AccountDetails accountDetails = new AccountDetails(name, aadhaarnum, email, contact_num);
                    acc.add(accountDetails);
                    break;
                default:
                    System.out.println("ENTER THE VALID CHOICE");
            }
        }
    }
}
