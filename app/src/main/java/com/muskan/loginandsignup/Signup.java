package com.muskan.loginandsignup;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.muskan.loginandsignup.controller.ClassInterface;
import com.muskan.loginandsignup.controller.InterfaceImplements;
import com.muskan.loginandsignup.model.DataStore;


/**
 * A simple {@link Fragment} subclass.
 */
public class Signup extends Fragment {
 public EditText etsignname,etsignpassword,etsignconfrimpassword;
 public Button btsignup;

    public Signup() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_signup, container, false);
        etsignname= view.findViewById(R.id.etsignname);
        etsignpassword=view.findViewById(R.id.etsignpassword);
        etsignconfrimpassword=view.findViewById(R.id.etsignconfrimpassword);
        btsignup=view.findViewById(R.id.btsignup);
        btsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name,password ,repassword;
                name=etsignname.getText().toString();
                password=etsignpassword.getText().toString();
                repassword=etsignconfrimpassword.getText().toString();
                DataStore dataStore = new DataStore();
                dataStore.DataStores(name,password,repassword);
                ClassInterface inst = new InterfaceImplements();
               if( inst.addUser(dataStore)){
                   Toast.makeText(getContext(), "welcome to family "+dataStore.getName(), Toast.LENGTH_SHORT).show();
               }else{
                   Toast.makeText(getContext(), "password and repassword must be same", Toast.LENGTH_SHORT).show();

               }
            }
        });
        return view;
    }

}
