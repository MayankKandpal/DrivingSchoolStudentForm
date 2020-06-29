package com.example.qodiegence_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText etName,etEmail,etPhone,etDOB,etAddress,etLicense,etBatch,etBalance;
    Button button;
    RadioGroup radio;
    RadioButton radioButton;
    DatabaseReference rfr;
    private final static String Tag = "Error occured";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etEmail =findViewById(R.id.etEmail);
        etPhone =findViewById(R.id.etPhone);
        etDOB =findViewById(R.id.etDOB);
        etAddress =findViewById(R.id.etAddress);
        etLicense =findViewById(R.id.etLicense);
        etBatch =findViewById(R.id.etBatch);
        button = findViewById(R.id.button);
        radio =findViewById(R.id.radio);
        etBalance = findViewById(R.id.etBalance);
        rfr = FirebaseDatabase.getInstance().getReference("Students");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addStudent();
               // Intent intent = new Intent(MainActivity.this,dataActivity.class);
               // startActivity(intent);
                fetchData();
            }
        });
    }

    private void fetchData() {

    }

    private void addStudent() {
        String name = etName.getText().toString();
        String phone = etPhone.getText().toString();
        String address =etAddress.getText().toString();
        String email = etEmail.getText().toString();
        String dob =etDOB.getText().toString();
        String license =etLicense.getText().toString();
        String batch = etBatch.getText().toString();
        String balance = etBalance.getText().toString();
        int radioid = radio.getCheckedRadioButtonId();
        radioButton = findViewById(radioid);
        String course = radioButton.getText().toString();
        example Example = new example(name,phone,address,dob,email,license,batch,balance,course);

        String id = String.valueOf(System.currentTimeMillis());
        try {
            rfr.child(id).push().setValue(Example);
        } catch (Exception e) {
            Log.d(Tag,"error");
        }
        Toast.makeText(this, "New Student added", Toast.LENGTH_SHORT).show();
    }
}