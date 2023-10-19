package amazon;

import java.util.ArrayList;
import java.util.Scanner;

public class Amazon {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

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
            System.out.println("2)----->Login");
            System.out.println("3)----->List all users");
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
                    System.out.print("ENTER THE EMAIL : ");
                    email = sc.next();
                    System.out.print("ENTER THE PASSWORD : ");
                    pass = sc.next();

                    for(int i=0; i < users.size(); i++) {
                        if(users.get(i).getUser_email().equals(email) && users.get(i).getPass().equals(pass)) {
                           boolean admin_menu = true;

                            if(users.get(i).isAdmin() == true) {
                                while(admin_menu) {
                                    System.out.println("\n0)----->Logout");
                                    System.out.println("1)----->Add Products");
                                    System.out.println("2)----->List of Products");
                                    System.out.println("ENTER THE CHOICE : ");
                                    int admin_choice = sc.nextInt();

                                    switch(admin_choice) {
                                        case 0:
                                            System.out.print("Thank you for visiting.");
                                            admin_menu = false;
                                            break;
                                        case 1:
                                            System.out.print("ENTER THE PRODUCT NAME : ");
                                            String p_name = sc.next();
                                            System.out.print("ENTER THE PRICE : ");
                                            int price = sc.nextInt();

                                            Product product = new Product(p_name, price);
                                            products.add(product);
                                            break;
                                        case 2:
                                            System.out.println("*********************Products*********************");
                                            System.out.println("ID"+ " " + "Product" + " " + "Price");
                                            for(int j=0; j < products.size(); j++ ) {
                                                System.out.println(products.get(j).getP_id() + " " +products.get(j).getP_name() +" " + products.get(j).getPrice());
                                            }
                                            break;
                                        default :
                                            System.out.println("ENTER THE VALID CHOICE");
                                    }
                                }
                            } else {
                                boolean customer_menu = true;
                               while(customer_menu) {
                                   System.out.println("\n0)----->LOGOUT");
                                   System.out.println("1)----->View Products");
                                   System.out.println("2)----->Add to cart");
                                   System.out.println("3)----->View cart products");
                                   System.out.print("ENTER THE CHOICE : ");
                                   int customer_choice = sc.nextInt();
                                   switch (customer_choice) {
                                       case 0:
                                           System.out.print("Thank you for visiting...");
                                           customer_menu = false;
                                           break;
                                       case 1:
                                           System.out.println("*********************Products*********************");
                                           System.out.println("ID"+ " " + "Product" + " " + "Price");
                                           for(int j=0; j < products.size(); j++) {
                                               System.out.print(products.get(j).getP_id() + " " +products.get(j).getP_name() +" " + products.get(j).getPrice());
                                           }
                                           break;
                                       case 2:
                                           System.out.print("ENTER THE ID OF PRODUCT : ");
                                           int id = sc.nextInt();
                                           for(int j = 0; j < products.size(); j++) {
                                               if(products.get(j).getP_id() == id) {
                                                   users.get(i).carts.add(products.get(j));
                                               }
                                           }
                                           break;
                                       case 3:
                                           System.out.println("**************CART PRODUCTS**************");
                                           for(int j = 0; j < users.get(i).carts.size(); j++) {
                                               System.out.println(users.get(i).carts.get(j).getP_name());
                                           }
                                           break;
                                       default:
                                           System.out.println("ENTER THE VALID CHOICE");
                                   }
                               }
                            }
                        }
                    }
                    break;
                case 3:
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
