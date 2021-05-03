package com.example.carinfo;

import android.app.Application;

import java.util.ArrayList;

public class cardata extends Application {
    public static ArrayList<car> c;

    @Override
    public void onCreate() {
        super.onCreate();
        c=new ArrayList<>();
        c.add(new car("Polo","Chuck Norris","03344890","volkswagen"));
        c.add(new car("E200","Peter Pollock","030078890","mercedes"));
        c.add(new car("Almera","Chris James","0334412345","nissan"));
        c.add(new car("E180","John Rambo","030078890","mercedes"));
        c.add(new car("Kombi","Nelson Mandela","03344890","volkswagen"));
        c.add(new car("Navara","Paul Bunting","0334412345","nissan"));
    }
}
