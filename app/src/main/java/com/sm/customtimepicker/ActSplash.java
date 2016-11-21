package com.sm.customtimepicker;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ActSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_splash);
    }

    public void onButtonClicked(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "TimePicker");
    }
}
/*
https://android--examples.blogspot.com/2015/04/timepickerdialog-in-android.html

*/