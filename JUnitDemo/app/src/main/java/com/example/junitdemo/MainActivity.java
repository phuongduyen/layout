package com.example.junitdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public static Intent createIntent(Context context, String username){
        Intent i = new Intent(context, MainActivity.class);
        i.putExtra("username", username);
        return i;
    }

    public static boolean icheck(int a, int b){
        if(a < b) return true;
        else return false;
    }
}
