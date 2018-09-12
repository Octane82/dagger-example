package com.everlapp.daggerexample.di;

import com.everlapp.daggerexample.ui.LobbyActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract LobbyActivity bindLobbyActivity();



}
