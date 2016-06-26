package com.example.jayant.myapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    SQLiteDatabase db;
    Button btNext;
    EditText etName, etEmail, etPassword, etStreet, etCity, etState, etZip, etInterests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btNext = (Button) findViewById(R.id.btNext);

        etName = (EditText) findViewById(R.id.editName);
        etEmail = (EditText) findViewById(R.id.editEmail);
        etPassword = (EditText) findViewById(R.id.editPassword);
        etStreet = (EditText) findViewById(R.id.editStreet);
        etCity = (EditText) findViewById(R.id.editCity);
        etState = (EditText) findViewById(R.id.editState);
        etZip = (EditText) findViewById(R.id.editZip);
        etInterests = (EditText) findViewById(R.id.editInterests);
        db = openOrCreateDatabase("MyDb2", MODE_PRIVATE, null);
        db.execSQL("create table if not exists mytable5(name varchar, email varchar,password varchar,street varchar,city varchar,state varchar,zip varchar,interest varchar)");

        btNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

            String name = etName.getText().toString();
            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();
            String street = etStreet.getText().toString();
            String city = etCity.getText().toString();
            String state = etState.getText().toString();
            String zip = etZip.getText().toString();
            String interests = etInterests.getText().toString();
            db.execSQL("insert into mytable5 values('" + name + "','" + email + "','" + password + "','"+street+"','"+city+"','"+state+"','"+zip+"','"+interests+"')");
            Toast.makeText(this, "values inserted successfully.", Toast.LENGTH_LONG).show();

            Intent i = new Intent(ProfileActivity.this,Activity3.class);
            startActivity(i);

           }

}
