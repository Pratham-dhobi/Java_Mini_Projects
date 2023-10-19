package amazon;

import java.util.ArrayList;

public class User {
    private int user_id;
    private String user_name, user_email, pass;
    private boolean admin = false;

    ArrayList<Product> carts = new ArrayList<>();

    public User(String user_name, String user_email, String pass) {
        this.user_id = (int)(100000 + Math.random() * 1000000);
        this.user_name = user_name;
        this.user_email = user_email;
        this.pass = pass;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }


    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }
}
