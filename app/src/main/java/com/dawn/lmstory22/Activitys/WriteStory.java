package com.dawn.lmstory22.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dawn.lmstory22.R;

public class WriteStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writestory);
    }


    public void goBack(View view) {
        finish();
    }
}
