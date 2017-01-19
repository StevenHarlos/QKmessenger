package com.redsodeeepop.android.qkmessage;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by RedSodeeePop on 2016-08-23.
 */
public class QKMessage extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(new Parse.Configuration.Builder(this).applicationId("1iNfbIHXQEnlMzuDD2pNKmOzt1qvU7omih015oM8").clientKey("e5xKi6NCAEFpO4XFHD7RfoIFdHXQ8MiAazLeJZgh").server("https://parseapi.back4app.com/").build());
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
