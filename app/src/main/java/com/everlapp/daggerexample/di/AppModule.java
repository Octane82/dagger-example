package com.everlapp.daggerexample.di;

import android.content.Context;

import com.everlapp.daggerexample.App;
import com.everlapp.daggerexample.ui.CommonHelloService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/**
 * This is where you will inject application-wide dependencies.
 */
@Module
public class AppModule {

    @Provides
    Context provideContext(App application) {
        return application.getApplicationContext();
    }


    @Singleton
    @Provides
    CommonHelloService provideCommonHelloService() {
        return new CommonHelloService();
    }

}
