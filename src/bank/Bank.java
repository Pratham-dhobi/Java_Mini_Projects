package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        ArrayList<AccountDetails> acc = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n0)----->Exit");
            System.out.println("1)----->Create Account");
            System.out.println("2)----->Deposit");
            System.out.println("3)----->Withdraw");
            System.out.println("4)----->Check Balance");
            System.out.print("ENTER THE CHOICE : ");
            int choice = sc.nextInt();

            switch(choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Enter Applicant's name : ");
                    String name = sc.next();
                    System.out.print("Enter Applicant's Aadhaar number : ");
                    int aadhaarnum = sc.nextInt();
                    System.out.print("Enter email id : ");
                    String email = sc.next();
                    System.out.print("Enter contact number : ");
                    int contact_num = sc.nextInt();
                    while(true) {
                        System.out.print("Set your password : ");
                        int pass = sc.nextInt();
                        System.out.print("Retype password : ");
                        int temp = sc.nextInt();
                        if(pass == temp) {
                            AccountDetails accountDetails = new AccountDetails(name, aadhaarnum, email, contact_num, pass);
                            acc.add(accountDetails);
                            System.out.println("Your Account is successfully created.");
                            System.out.println("Your Account number : " + accountDetails.getAcc_num());
                            break;
                        } else {
                            System.out.println("password mismatch");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter the Account number : ");
                    int acc_num = sc.nextInt();
                    System.out.print("Enter the password : ");
                    int pass = sc.nextInt();
                    boolean flag = false;
                    for(int i = 0; i < acc.size(); i++) {
                        if(acc.get(i).getAcc_num() == acc_num && acc.get(i).getPass() == pass) {
                            System.out.print("Enter the Amount : ");
                            double amount = sc.nextDouble();
                            acc.get(i).setBalance(acc.get(i).getBalance() + amount);
                            System.out.println("RS." + (amount) + " DEPOSITED IN YOUR ACCOUNT");
                            System.out.println("current balance : "+acc.get(i).getBalance());
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        System.out.println("Enter the valid Details");
                    }
                    break;
                case 3:
                    System.out.print("Enter the Account number : ");
                    acc_num = sc.nextInt();
                    System.out.print("Enter the password : ");
                    pass = sc.nextInt();
                    flag = false;
                    for(int i = 0; i < acc.size(); i++) {
                        if(acc.get(i).getAcc_num() == acc_num && acc.get(i).getPass() == pass) {
                            System.out.print("Enter the amount :");
                            double withdraw_amt = sc.nextDouble();
                            if(acc.get(i).getBalance() >= withdraw_amt) {
                                acc.get(i).setBalance(acc.get(i).getBalance() - withdraw_amt);
                                System.out.println("RS." + (withdraw_amt) + " IS DEBITED FROM YOUR ACCOUNT.");
                                flag = true;
                            } else {
                                System.out.println("You can not withdraw money because of less balance.");
                                flag = true;
                            }
                            break;
                        }
                    }
                    if(!flag) {
                        System.out.println("Enter the valid Details");
                    }
                    break;
                case 4:
                    System.out.print("Enter the Account number : ");
                    acc_num = sc.nextInt();
                    System.out.print("Enter the password : ");
                    pass = sc.nextInt();
                    flag = false;
                    for(int i = 0; i < acc.size(); i++) {
                        if(acc.get(i).getAcc_num() == acc_num && acc.get(i).getPass() == pass) {
                            System.out.println("Account Balance : "+ (acc.get(i).getBalance()));
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        System.out.println("Enter the valid details");
                    }
                    break;
                default:
                    System.out.println("ENTER THE VALID CHOICE");
            }
        }
    }
}
