package com.muskan.loginandsignup.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.muskan.loginandsignup.DisplayContacts;
import com.muskan.loginandsignup.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;


public class ContactsAdapaters extends RecyclerView.Adapter<ContactsAdapaters.ContactsViewHolder>{

    Context context;
    List<Contacts> contactsList;

    public ContactsAdapaters(Context context, List<Contacts> contactsList) {
        this.context = context;
        this.contactsList = contactsList;
    }



    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.phone,parent,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        final Contacts contacts = contactsList.get(position);
        holder.img.setImageResource(contacts.getImage());
        holder.txname.setText(contacts.getName());
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DisplayContacts.class);
                intent.putExtra("image",contacts.getImage());
                intent.putExtra("name",contacts.getName());
                intent.putExtra("number",contacts.getNumber());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {
        CircleImageView img;
        TextView txname;
        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.circleimg);
            txname=itemView.findViewById(R.id.txtname);

        }
    }
}
