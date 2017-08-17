package com.menisamet.activityfb;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by meni on 17/08/17.
 */

class UserData {
    private static final UserData ourInstance = new UserData();

    static UserData getInstance() {
        return ourInstance;
    }

    private UserData() {
    }

    public void test() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");
    }
}
