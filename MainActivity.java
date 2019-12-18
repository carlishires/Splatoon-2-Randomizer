package com.example.imperialcalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText myEditText;
    float valOne, valTwo;
    boolean have2Val, isAdd, isSubtract, isMultiply, isDivide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEditText = (EditText) findViewById(R.id.edit);  // creates the bar where all the text goes

    }

    public void click (View v) {
        Button b = (Button)v;
        String bText = b.getText().toString();
        myEditText.setText(myEditText.getText() + bText);

    }

    public void add (View v) {
        if (have2Val) {  // if there are already 2 values that need to be added/subtracted/multiplied/divided together
            valOne = doMath(valOne, valTwo);
            myEditText.setText(Float.toString(valOne)); // sets the text to the solution of the two values
        }
        myEditText.setText(myEditText.getText() + "+");
        have2Val = true;
        isAdd = true;
        // set have2 val to true
        // set isAdd to true
    }

    public float doMath(float val1, float val2) {
        if (isAdd) {
            return val1 + val2;
        }
        else if (isSubtract) {
            return val1 - val2;
        }

        else if (isMultiply) {
            return val1 * val2;
        }

        else {
            return val1/val2;
        }
    }
}
