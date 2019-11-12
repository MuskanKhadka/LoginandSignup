package com.muskan.loginandsignup.controller;

import com.muskan.loginandsignup.model.DataStore;

public interface ClassInterface {
boolean addUser(DataStore ds);
boolean checkuser(String name,String password);
}
