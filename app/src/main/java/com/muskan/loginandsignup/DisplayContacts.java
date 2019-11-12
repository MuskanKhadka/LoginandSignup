package com.muskan.loginandsignup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;
import fragements.AreaofCircle;

public class DisplayContacts extends AppCompatActivity {
    private CircleImageView circleimg;
    private TextView txtname, txtnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contacts);
        circleimg = findViewById(R.id.circleimg);
        txtname = findViewById(R.id.txtname);
        txtnumber = findViewById(R.id.txtnumber);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            circleimg.setImageResource(bundle.getInt("image"));
            txtname.setText(bundle.getString("name"));
            txtnumber.setText(bundle.getString("number"));
        }
    }

}

