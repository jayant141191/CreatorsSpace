package com.example.jayant.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by jayant on 6/24/2016.
 */
public class Activity2 extends Activity implements View.OnClickListener{
    SQLiteDatabase db;
    Button btInsert;
    EditText etName,etMat,etUse,etAud;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.activity2);
        btInsert = (Button)findViewById(R.id.btInsert);
        etName = (EditText)findViewById(R.id.projectName);
        etMat = (EditText)findViewById(R.id.projMat);
        etUse = (EditText)findViewById(R.id.projUse);
        etAud = (EditText)findViewById(R.id.projAud);
        db = openOrCreateDatabase("MyDb",MODE_PRIVATE,null);
        db.execSQL("create table if not exists mytable(name varchar, materials varchar,usefulness varchar,audience varchar)");
        btInsert.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String name = etName.getText().toString();
        String mat = etMat.getText().toString();
        String use = etUse.getText().toString();
        String aud = etAud.getText().toString();
        db.execSQL("insert into mytable values('"+name+"','"+mat+"','"+use+"','"+aud+"')");
        Toast.makeText(this, "values inserted successfully.", Toast.LENGTH_LONG).show();
        Intent in = new Intent(Activity2.this,HomeActivity.class);
        startActivity(in);

    }
}
