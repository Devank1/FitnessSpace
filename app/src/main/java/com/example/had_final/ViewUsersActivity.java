package com.example.had_final;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ViewUsersActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_users);

        databaseHelper = new DatabaseHelper(this);

        List<User> users = databaseHelper.getAllUsers();

        StringBuilder usersList = new StringBuilder();
        for (User user : users) {
            usersList.append(user.getName()).append(" - ").append(user.getEmail()).append("\n");
        }

        Toast.makeText(this, usersList.toString(), Toast.LENGTH_LONG).show();
    }
}