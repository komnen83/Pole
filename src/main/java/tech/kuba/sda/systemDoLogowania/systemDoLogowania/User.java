package tech.kuba.sda.systemDoLogowania.systemDoLogowania;

public class User {

    private String firstName;
    private String lastName;
    private String login;
    private String password;

    User(String firstName, String lastName, String login, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "First name= " + firstName +
                ", Last name= " + lastName +
                ", User= " + login +
                ", Password= " + password;
    }
}
