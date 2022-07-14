package learn.java;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    //1
    public String getFirstName() {
        return firstName;
    }

    //2
    public String getLastName() {
        return lastName;
    }

    //3
    public int getAge() {
        return age;
    }

    //4
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //5
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //6
    public void setAge(int age) {
        if(age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    //7
    public boolean isTeen() {
        if(age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    //8
    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if(firstName.isEmpty()) {
            return lastName;
        } else if(lastName.isEmpty()) {
            return firstName;
        }

        return firstName + " "  + lastName;
    }

}