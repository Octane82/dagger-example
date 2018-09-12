package com.everlapp.daggerexample.di;

import com.everlapp.daggerexample.ui.LobbyActivity;
import com.everlapp.daggerexample.ui.LobbyFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


/**
 * Binds all sub-components within the app.
 */
@Module
public abstract class BuildersModule {

    /*@ContributesAndroidInjector
    abstract LobbyActivity bindLobbyActivity();*/

    @ContributesAndroidInjector(modules = {LobbyActivityModule.class})
    abstract LobbyActivity bindLobbyActivity();

    @ContributesAndroidInjector(modules = {LobbyFragmentModule.class})
    // or gain access to lobby activity dependencies from fragment via
    // @ContributesAndroidInjector(modules = {LobbyFragmentModule.class, LobbyActivityModule.class})
    abstract LobbyFragment bindLobbyFragment();


    // Add bindings for other sub-components here


}
