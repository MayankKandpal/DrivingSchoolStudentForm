package com.example.qodiegence_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class dataActivity extends AppCompatActivity {
  RecyclerView rcview;
  DatabaseReference rfr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        rcview = findViewById(R.id.rcview);
        rfr = FirebaseDatabase.getInstance().getReference("Students");
        rfr.child()
    }
}