package com.aca.classroom.week6.set;

public class User {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof User)) {
            return false;
        }

        User user = (User) obj;

        return user.firstName.equals(this.firstName) &&
            user.lastName.equals(this.lastName);
    }

    @Override
    public String toString() {
        return "first name: " + firstName + " last name: " + lastName;
    }
}
