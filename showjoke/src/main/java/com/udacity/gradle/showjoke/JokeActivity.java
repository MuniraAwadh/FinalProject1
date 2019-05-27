package com.udacity.gradle.showjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    private TextView joke_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent=getIntent();
        String joke=intent.getStringExtra("Joke");
        joke_text= (TextView) findViewById(R.id.joke);
        joke_text.setText(joke);
    }
}
