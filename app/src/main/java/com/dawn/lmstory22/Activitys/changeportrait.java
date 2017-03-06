package com.dawn.lmstory22.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dawn.lmstory22.R;

public class changeportrait extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changeportrait);
    }

    public void goBack(View view) {
        finish();
    }
}
