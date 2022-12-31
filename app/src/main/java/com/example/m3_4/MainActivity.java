package com.example.m3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.main_button);
        counter = 0;
    }
    public void buttonClick(View view) {
        // increment counter by 1 for every button click
        counter++;
        // check If the number of clicks is a winning number in 7 boom it will display boom! and the number of clicks
        if((counter % 7 == 0) || (containsSeven(counter))) {
            btn.setText("BOOM !\n("+counter+")");
        }
        else
        {
            //change the button content to "This is a click number:<counter>" if the number is not wining
            btn.setText("This is a click number:" + counter);
        }
    }
    public static boolean containsSeven(int counter) {
        // Loop through each digit of the number
        while (counter > 0)
        {
            // Get the last digit of the number
            int digit = counter % 10;
            // If the digit is 7, return true
            if (digit == 7)
            {
                return true;
            }
            // Remove the last digit from the number
            counter /= 10;
        }
        // If we reach here, the number does not contain the digit 7
        return false;
    }
}