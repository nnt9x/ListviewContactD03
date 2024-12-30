package com.bkacad.edu.nnt.listviewcontactd03;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bkacad.edu.nnt.listviewcontactd03.adapter.MyAdapter;
import com.bkacad.edu.nnt.listviewcontactd03.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Khai bao view
    private ListView lvContacts;

    // Du lieu
    private List<Contact> data;
    // Adapter
    private MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Bind Id
        lvContacts = findViewById(R.id.lv_main_contacts);
        // Tao du lieu
        data = new ArrayList<>();
        data.add(new Contact("Contact 1", "098828282","https://cdn2.iconfinder.com/data/icons/mixed-communication-and-ui-pack/48/general_pack_NEW__user-512.png","contact1@gmail.com"));
        data.add(new Contact("Contact 2", "098828283","https://cdn2.iconfinder.com/data/icons/mixed-communication-and-ui-pack/48/general_pack_NEW__user-512.png","contact2@gmail.com"));
        data.add(new Contact("Contact 3", "098828284","https://w7.pngwing.com/pngs/589/83/png-transparent-account-avatar-contact-people-profile-user-basic-icon.png","contact3@gmail.com"));
        data.add(new Contact("Contact 4", "098828285","https://cdn2.iconfinder.com/data/icons/mixed-communication-and-ui-pack/48/general_pack_NEW__user-512.png","contact4@gmail.com"));

        // Tao adapter
        myAdapter = new MyAdapter(this, data);
        // SetAdapter cho listview
        lvContacts.setAdapter(myAdapter);
        // Bat su kien click
        lvContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact contact = data.get(position);
                Toast.makeText(MainActivity.this, contact.getEmail(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}