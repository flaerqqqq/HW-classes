package models;

import java.time.LocalDateTime;

public class User {

    private String username;

    private String firstName;

    private String lastName;

    private int age;

    private final LocalDateTime completedAt;

    public User(String username, String firstName, String lastName, int age){
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        completedAt = LocalDateTime.now();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", completedAt=" + completedAt +
                '}';
    }
}
