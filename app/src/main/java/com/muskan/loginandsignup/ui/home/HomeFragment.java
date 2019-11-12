package com.muskan.loginandsignup.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.muskan.loginandsignup.R;

public class HomeFragment extends Fragment {
private Button btSum;
private EditText etFsum,etSsum;
private TextView tvSum;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
       btSum = view.findViewById(R.id.btSum);
       etFsum = view.findViewById(R.id.etFsum);
       etSsum = view.findViewById(R.id.etSsum);
       tvSum = view.findViewById(R.id.tvSum);
       btSum.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int a,b,result;
               a= Integer.parseInt(etFsum.getText().toString());
               b=Integer.parseInt(etSsum.getText().toString());
               result=a+b;
               tvSum.setText(String.valueOf(result));
           }
       });

        return view;
    }
}