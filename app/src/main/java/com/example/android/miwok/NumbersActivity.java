package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);




        ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        //find the root view so we can add child views to it.
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        //create variable to keep track of the current index position
        int i = 0;

          while (i < words.size()){
            //create a new TextView
            TextView wordView = new TextView(this);

            //set the text to be word at the current index
            wordView.setText(words.get(i));

            //add this TextView as another child to the root view of this layout
            rootView.addView(wordView);

            //increment the index variable by 1
            i++;

             }
    }

}
