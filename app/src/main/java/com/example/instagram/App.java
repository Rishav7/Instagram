package com.example.instagram;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LjX7ZudW7EluhapQwAg2tPoffmqvaJqS4m3BNuE4")
                // if defined
                .clientKey("lQI2AaqBCYnoYy6NM2p5aZEoZ9j3m0ynVlD88P5C")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
