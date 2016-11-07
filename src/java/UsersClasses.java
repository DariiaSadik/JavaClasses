package java;

public class UsersClasses {
    private String FirstName;
    private String SecondName;

    public UsersClasses(String firstName, String secondName) {
        FirstName = firstName;
        SecondName = secondName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    @Override
    public String toString() {
        return FirstName + ' ' + SecondName;
    }
}
