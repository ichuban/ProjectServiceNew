package Week5;

import java.time.LocalDate;

public class User {

    private String name;
    private String surrname;
    private int ID;
    private LocalDate dayOfBirth;
    private String password;
    private String email;
    private String login;



    public User(String name, String surrname, int ID, String login, String password, String email, LocalDate dayOfBirth) {
        this.login = login;
        this.name = name;
        this.surrname = surrname;
        this.ID = ID;
        this.dayOfBirth = dayOfBirth;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurrname() {
        return surrname;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        dayOfBirth = dayOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}


