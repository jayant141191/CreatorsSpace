package com.example.jayant.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    SharedPreferences profInfo;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = (ImageButton) findViewById(R.id.imageButton1);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        profInfo = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        editor = profInfo.edit();

    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.imageButton1:
                editor.putString("creator", "Writer");
                editor.apply();
                Intent intent =
                        new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
                break;
            case R.id.imageButton2:
                editor.putString("creator", "Engineer");
                editor.apply();
                Intent intent2 =
                        new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent2);
                break;
            case R.id.imageButton3:
                editor.putString("creator", "Artist");
                editor.apply();
                Intent intent3 = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent3);
        }
    }
}

    /*
    Button btExist,btNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btExist = (Button)findViewById(R.id.btExist);
        btNew = (Button)findViewById(R.id.btNew);
        btExist.setOnClickListener(this);
        btNew.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btExist:
                Intent existIdea = new Intent(MainActivity.this, Activity2.class);
                startActivity(existIdea);
                break;
            case R.id.btNew:
                Intent newIdea = new Intent(MainActivity.this, Activity2.class);
                startActivity(newIdea);
                break;
        }
    }
}
*/