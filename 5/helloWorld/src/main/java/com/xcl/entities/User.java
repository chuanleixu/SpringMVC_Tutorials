package com.xcl.entities;

/**
 * @author chuanlei.xu
 * @version 1.0
 * @date 2019/2/27 15:06
 */
public class User {

    private Integer id;
    private String username;
    private String password;

    private String email;
    private int age;

    private Address address;

    public User(String username, String password, String email, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public User(){

    }

    public User(Integer id, String username, String password, String email, int age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }



}
