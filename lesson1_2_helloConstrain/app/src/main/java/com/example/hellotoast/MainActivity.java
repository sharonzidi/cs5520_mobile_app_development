package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private int mZero = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint({"SetTextI18n", "ResourceAsColor"})
    public void countUp(View view) {
        ++mCount;
        view.setBackgroundColor(R.color.teal_200);
        if(mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
//            view.setBackgroundColor(R.color.teal_200);
//            if(mCount % 2 == 0) {
//                view.setBackgroundColor(R.color.teal_200);
//            } else {
//                view.setBackgroundColor(R.color.pink);
//            }
        }
    }

    @SuppressLint("ResourceAsColor")
    public void toZero(View view) {
        view.setBackgroundColor(R.color.grey);
        mShowCount.setText(Integer.toString(mZero));
        mCount = 0;
    }

}