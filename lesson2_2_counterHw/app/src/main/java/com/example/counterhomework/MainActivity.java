package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity<mCountView> extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    private int mCount = 0;
    private TextView mShowCount;
    private TextView mTextView;

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
            outState.putString("edit_text", mTextView.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.count);
        mTextView = (TextView) findViewById(R.id.editText);

       if(savedInstanceState != null) {
           mTextView.setText(savedInstanceState.getString("edit_text"));
       }

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    @SuppressLint("SetTextI18n")
    public void countNumber(View view) {
        mCount++;
        if(mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}