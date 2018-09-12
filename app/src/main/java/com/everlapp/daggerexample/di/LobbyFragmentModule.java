package com.everlapp.daggerexample.di;

import com.everlapp.daggerexample.ui.LobbyFragmentHelloService;

import dagger.Module;
import dagger.Provides;

/**
 * Define LobbyFragment-specific dependencies here.
 */
@Module
public class LobbyFragmentModule {

    @Provides
    LobbyFragmentHelloService provideLobbyFragmentHelloService() {
        return new LobbyFragmentHelloService();
    }


}
