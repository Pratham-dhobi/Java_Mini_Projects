package bank;

public class AccountDetails {
    private String name;
    private int aadhaarnum;
    private String email;
    private int contact_num;
    private int acc_num;

    public AccountDetails(String name, int aadhaarnum, String email, int contact_num) {
        this.acc_num = (int)(Math.random() * 500000000);
        this.name = name;
        this.aadhaarnum = aadhaarnum;
        this.email = email;
        this.contact_num = contact_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAadhaarnum() {
        return aadhaarnum;
    }

    public void setAadhaarnum(int aadhaarnum) {
        this.aadhaarnum = aadhaarnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContact_num() {
        return contact_num;
    }

    public void setContact_num(int contact_num) {
        this.contact_num = contact_num;
    }

    public int getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }
}
