package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hello git");
        System.out.println("hello git2");
        System.out.println("hello git4");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("push test");
    }
}