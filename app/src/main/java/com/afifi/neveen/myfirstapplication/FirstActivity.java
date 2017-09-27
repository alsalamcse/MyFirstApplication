package com.afifi.neveen.myfirstapplication;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        final int x=9;

        TimePickerDialog.OnTimeSetListener lis= new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {

            }
        };
        TimePickerDialog timePickerDialog=new TimePickerDialog(this,lis,10,10,true);
        timePickerDialog.show();

    }


}
