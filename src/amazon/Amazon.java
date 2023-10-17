package amazon;

import java.util.ArrayList;
import java.util.Scanner;

public class Amazon {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        User dummy1 = new User("harshad", "harshad@gmail.com", "harshad123");
        User dummy2 = new User("shayam", "shyam_23@yahoo.in", "shy@m1234");
        User dummy3 = new User("harshita", "harshita@gmail.com", "harshita123");
        User dummy4 = new User("sonal", "sonal@gmail.com", "sonal4654");
        User dummy5 = new User("vaibhav", "vaibhav234@gmail.com", "vaibhav312");
        User admin = new User("admin", "admin@gmail.com", "@dm!n");
        admin.setAdmin(true);
        users.add(admin);
        users.add(dummy1);
        users.add(dummy2);
        users.add(dummy3);
        users.add(dummy4);
        users.add(dummy5);

        while(true) {
            System.out.println("\n0)----->Exit");
            System.out.println("1)----->Signup");
            System.out.println("2)----->List all users");
            System.out.print("Enter the choice : ");
            int choice = sc.nextInt();

            switch(choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Enter the First name : ");
                    String name = sc.next();
                    sc.nextLine();
                    System.out.print("Enter the Email : ");
                    String email = sc.next();
                    System.out.print("Enter the Password : ");
                    String pass = sc.next();
                    User dummy = new User(name, email, pass);
                    users.add(dummy);
                    break;
                case 2:
                    System.out.println("Are You Admin ?\n Enter 1 if you are Admin \n Enter 2 if you are not Admin");
                    System.out.print("Enter the choice : ");
                    int choose = sc.nextInt();
                    switch(choose) {
                        case 1:
                            System.out.print("Enter the Email : ");
                            String admin_email = sc.next();
                            System.out.print("Enter the Password : ");
                            String admin_pass = sc.next();
                            if(admin_email.equals(admin.getUser_email()) && admin_pass.equals(admin.getPass())) {
                                System.out.println("\n***************Users***************");
                                for(int i = 0; i < users.size(); i++) {
                                    System.out.println(users.get(i).getUser_name());
                                }
                            }else{
                                System.out.print("Enter the valid email and password");
                            }
                            break;
                        case 2:
                            System.out.print("You can not read data.");
                            break;
                        default:
                            System.out.println("ENTER THE VALID CHOICE");
                    }
                    break;
                default:
                    System.out.println("ENTER THE VALID CHOICE");
            }
        }
    }
}
