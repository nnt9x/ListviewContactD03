package com.bkacad.edu.nnt.listviewcontactd03.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bkacad.edu.nnt.listviewcontactd03.R;
import com.bkacad.edu.nnt.listviewcontactd03.model.Contact;
import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    // Thuoc tinh
    private Context context;
    private List<Contact> data;

    // Phuong thuc khoi tao
    public MyAdapter(Context context, List<Contact> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        // Co the de id = position
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_contact_view, parent, false);
        }
        // Khai bao view va bind id
        ImageView imgContact = convertView.findViewById(R.id.img_item_contact);
        TextView tvName = convertView.findViewById(R.id.tv_item_contact_name);
        TextView tvPhone = convertView.findViewById(R.id.tv_item_contact_phone);
        // Do du lieu vao view
        Contact contact = data.get(position);
        tvName.setText(contact.getName());
        tvPhone.setText(contact.getPhone());
        Glide.with(convertView).load(contact.getImage()).into(imgContact);

        return convertView;
    }
}
