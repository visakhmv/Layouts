package com.maria.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void selectFrag(View view) {
        if(view == findViewById(R.id.btnLinear)) {
            startActivity(new Intent(getApplicationContext(),LinearActivity.class));
        }else if(view == findViewById(R.id.btnRelative)) {
            startActivity(new Intent(getApplicationContext(),RelativeActivity.class));
        }else {
            startActivity(new Intent(getApplicationContext(),GridActivity.class));
        }
    }
}
