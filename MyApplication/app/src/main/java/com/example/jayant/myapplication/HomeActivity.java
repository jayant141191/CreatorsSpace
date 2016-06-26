package com.example.jayant.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView quote = (TextView)findViewById(R.id.quote);
        ArrayList<String> quoteList = new ArrayList<String>();
        quoteList.add("Perfection is not attainable, but if we chase perfection we can catch excellence.\n - Vince Lombardi");
        quoteList.add("I hated every minute of training, but I said, 'Don't quit. Suffer now and live the rest of your life as a champion.'\n - Muhammad Ali");
        quoteList.add("We know what we are, but know not what we may be.\n - William Shakespeare");
        quoteList.add("Nothing is impossible, the word itself says 'I'm possible'!\n - Audrey Hepburn");
        quoteList.add("The best preparation for tomorrow is doing your best today.\n - H. Jackson Brown, Jr");
        quoteList.add("Do it, just do it! Don't let your dreams be dreams.\n - Shia Labeouf");

        Random rand = new Random();
        int n = rand.nextInt(5);

        quote.setText(quoteList.get(n));

    }


}
