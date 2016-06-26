package com.example.jayant.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by jayant on 6/25/2016.
 */
public class Activity3 extends Activity implements View.OnClickListener{

    Button btExist,btNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        btExist = (Button)findViewById(R.id.btExist);
        btNew = (Button)findViewById(R.id.btNew);
        btExist.setOnClickListener(this);
        btNew.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btExist:
                Intent existIdea = new Intent(Activity3.this, Activity2.class);
                startActivity(existIdea);
                break;
            case R.id.btNew:
                Intent newIdea = new Intent(Activity3.this, Activity2.class);
                startActivity(newIdea);
                break;
        }
    }
}

