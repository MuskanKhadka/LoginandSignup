package com.muskan.loginandsignup.controller;

import com.muskan.loginandsignup.model.DataStore;


public class InterfaceImplements implements ClassInterface {
    static String Lname,Lpassword;
    @Override
    public boolean addUser(DataStore ds) {
        boolean result =false;
        if(ds.getPassword().equals(ds.getRepassword())){
            Lname=ds.getName();
            Lpassword=ds.getPassword();
          result =true;
        }else{
            result=false;
        }
    return result;
    }

    @Override
    public boolean checkuser(String name, String password) {
        boolean result=false;
        if(name.equals(Lname)&&(password.equals(Lpassword))){
            result=true;
        }else
        {
            result=false;
        }
    return result;
    }
}
