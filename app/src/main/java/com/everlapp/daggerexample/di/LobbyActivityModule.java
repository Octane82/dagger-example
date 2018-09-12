package com.everlapp.daggerexample.di;

import com.everlapp.daggerexample.ui.LobbyHelloService;

import dagger.Module;
import dagger.Provides;


/**
 * Define LobbyActivity-specific dependencies here.
 */
@Module
public class LobbyActivityModule {

    @Provides
    LobbyHelloService provideLobbyHelloService() {
        return new LobbyHelloService();
    }

}
