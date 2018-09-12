package com.everlapp.daggerexample.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.everlapp.daggerexample.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class LobbyActivity extends AppCompatActivity implements HasSupportFragmentInjector {


    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;


    @Inject
    CommonHelloService commonHelloService;

    @Inject
    LobbyHelloService lobbyHelloService;

    private TextView tvCommonHello;

    private TextView tvLobbyHello;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCommonHello = findViewById(R.id.tvCommonHello);
        tvLobbyHello = findViewById(R.id.tvLobbyHello);
    }


    @Override
    protected void onResume() {
        super.onResume();

        sayCommonHello();

        sayLobbyHello();
    }



    private void sayCommonHello() {
        tvCommonHello.setText(commonHelloService.sayHello());
    }


    private void sayLobbyHello() {
        tvLobbyHello.setText(lobbyHelloService.sayHello());
    }




    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }
}
