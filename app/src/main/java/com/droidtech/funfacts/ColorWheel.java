package com.droidtech.funfacts;

import android.graphics.Color;

public class ColorWheel
{
    //select a random color
    private final String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor()
    {
        int number = (int) (Math.random() * mColors.length-1 + 0);

        //converts HEX to INT

        //int colorAsIn = Color.parseColor(mColors[number]);
        return Color.parseColor(mColors[number]);
    }
}
