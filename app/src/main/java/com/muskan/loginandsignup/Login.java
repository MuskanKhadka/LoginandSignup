package com.muskan.loginandsignup;


import android.content.Intent;
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


/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends Fragment {

private Button btnlogin;
private EditText etLoginname,etLoginpass;
    public Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_login, container, false);
        etLoginname=view.findViewById(R.id.etLoginname);
        etLoginpass=view.findViewById(R.id.etLoginpass);
        btnlogin=view.findViewById(R.id.btlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etLoginname.getText().toString();
                String password=etLoginpass.getText().toString();
                ClassInterface inst=new InterfaceImplements();
                if( inst.checkuser(name,password)){
                    Toast.makeText(getContext(), "welcome to family "+name, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getContext(),MusNav.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getContext(), "first signup ger ani login ger", Toast.LENGTH_SHORT).show();

                }

            }
        });
        return view;

                 }

}
