import java.time.LocalDate;

public class Employer{
    // region fields
    private String tabnum;
    private String phone;
    private String firstName;
    private String secondName;
    private String lastName;
    private int workExp;
    // endregion
    public Employer(String lastName, String firstName, String secondName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public Employer(String tabnum,String lastName, String firstName, String secondName, String phone, int workExp){
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.tabnum = tabnum;
        this.phone = phone;
        this.workExp = workExp;
    }
    // region getters
    public String getTabnum() {
        return tabnum;
    }

    public void setTabnum(String tabnum) {
        this.tabnum = tabnum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWorkExp() {
        return workExp;
    }

    public void setWorkExp(int workExperience) {
        this.workExp = workExperience;
    }
    // endregion
}
