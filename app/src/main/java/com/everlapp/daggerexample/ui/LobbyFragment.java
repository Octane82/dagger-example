package com.everlapp.daggerexample.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.everlapp.daggerexample.R;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;



public class LobbyFragment extends Fragment {


    @Inject
    LobbyFragmentHelloService lobbyFragmentHelloService;


    private TextView tvFragmentHello;

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lobby_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvFragmentHello = view.findViewById(R.id.tvLobbyFragmentHello);

        sayFragmentHello();
    }


    private void sayFragmentHello() {
        tvFragmentHello.setText(lobbyFragmentHelloService.sayHello());
    }



}
