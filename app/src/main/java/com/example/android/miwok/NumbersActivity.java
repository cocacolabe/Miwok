package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");

        words.add(new Word("one","lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko",R.drawable.number_two));
        words.add(new Word("three", "tolookosu",R.drawable.number_three));
        words.add(new Word("four", "oyyisa",R.drawable.number_four));
        words.add(new Word("five", "massokka",R.drawable.number_five));
        words.add(new Word("six", "temmokka",R.drawable.number_six));
        words.add(new Word("seven", "kenekaku",R.drawable.number_seven));
        words.add(new Word("eight", "kawinta",R.drawable.number_eight));
        words.add(new Word("nine", "wo'e",R.drawable.number_nine));
        words.add(new Word("ten", "na'aacha",R.drawable.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter =
                new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);


        /*
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
  */

        /*LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for (int index = 0 ; index < words.size(); index++){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);

        }
        */
    }

}
