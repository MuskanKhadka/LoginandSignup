package com.muskan.loginandsignup.ui.gallery;

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

public class GalleryFragment extends Fragment {
    private Button btArea;
    private EditText etArea;
    private TextView tvArea;

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        btArea = view.findViewById(R.id.btArea);
        etArea = view.findViewById(R.id.etArea);
        tvArea = view.findViewById(R.id.tvArea);
       btArea.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double a,result;
               a=Double.parseDouble(etArea.getText().toString());
               result = 3.14*(a*a);
               tvArea.setText(String.valueOf(result));
           }
       });
        return view;
    }
}