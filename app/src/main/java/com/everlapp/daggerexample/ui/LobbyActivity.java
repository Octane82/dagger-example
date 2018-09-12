package com.everlapp.daggerexample.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.everlapp.daggerexample.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class LobbyActivity extends AppCompatActivity {

    @Inject
    CommonHelloService commonHelloService;

    private TextView tvMessage;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = findViewById(R.id.tvMessage);
    }


    @Override
    protected void onResume() {
        super.onResume();

        sayCommonHello();
    }



    private void sayCommonHello() {
        tvMessage.setText(commonHelloService.sayHello());
    }


}
