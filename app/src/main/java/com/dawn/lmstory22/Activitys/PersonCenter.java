package com.dawn.lmstory22.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dawn.lmstory22.R;

public class PersonCenter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personcenter);
    }

    public void goBack(View view) {
        finish();
    }

    public void changename(View view) {
        startActivity(new Intent(PersonCenter.this,changenickname.class));
    }

    public void changesex(View view) {
            startActivity(new Intent(this,changesex.class));
        }

    public void changeemail(View view) {  startActivity(new Intent(this,changeemail.class));}

    public void changebirthday(View view) { startActivity(new Intent(this,changebirthday.class));}

    public void changepass(View view) { startActivity(new Intent(this,changepass.class));
    }
}
