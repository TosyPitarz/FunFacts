package com.droidtech.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends AppCompatActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName(); // get the name of the class
    // Declare our view variables
    private TextView mFactsTextView;
    private Button mShowFactButton;
    private FactBook mfact = new FactBook();
    private RelativeLayout mRelativeLayout;
    private ColorWheel mcolor = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts); //The most important line in this code

        // Assign the view from the layout file to the corresponding variables

        mFactsTextView = (TextView)findViewById(R.id.factTextView); //can fix with alt + enter
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // The button was clicked, update fact text view
                //String fact = "Ostriches can run faster than horses";

//                String[] facts = {
//                        "Ants stretch when they wake up in the morning.",
//                        "Ostriches can run faster than horses.",
//                        "Olympic gold medals are actually made mostly of silver.",
//                        "You are born with 300 bones; by the time you are an adult you will have 206.",
//                        "It takes about 8 minutes for light from the Sun to reach Earth.",
//                        "Some bamboo plants can grow almost a meter in just one day.",
//                        "The state of Florida is bigger than England.",
//                        "Some penguins can leap 2-3 meters out of the water.",
//                        "On average, it takes 66 days to form a new habit.",
//                        "Mammoths still walked the earth when the Great Pyramid was being built.", "mkd" };
//
//                int number = (int) (Math.random() * facts.length-1 + 0);
                mFactsTextView.setText(mfact.getFact());
                int colorGotten = mcolor.getColor();
                mRelativeLayout.setBackgroundColor(colorGotten);
                mShowFactButton.setTextColor(colorGotten);
            }
        };
        mShowFactButton.setOnClickListener(listener);
        //Toast.makeText(FunFactsActivity.this, "our activity was created!", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "We are logging from the on create method");

    }
}
