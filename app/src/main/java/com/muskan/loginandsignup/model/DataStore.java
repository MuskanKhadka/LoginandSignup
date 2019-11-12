package com.muskan.loginandsignup.model;

public class DataStore {
    private String name;
    private String password;
    private String repassword;

    public void DataStores(String name, String password, String repassword) {
        this.name = name;
        this.password = password;
        this.repassword = repassword;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRepassword() {
        return repassword;
    }
}
