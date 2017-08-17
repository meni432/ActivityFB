package com.menisamet.activityfb;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.menisamet.activityfb.Models.Event;
import com.menisamet.activityfb.Models.Topic;
import com.menisamet.activityfb.Models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meni on 17/08/17.
 */

class Database {
    private static final Database ourInstance = new Database();

    private FirebaseDatabase database = FirebaseDatabase.getInstance();

    private FirebaseUser loginUser;
    private User currentUser;

    private List<User> allUsers;

    static Database getInstance() {
        return ourInstance;
    }

    private Database() {

    }

    public void loadAllUsers() {
        DatabaseReference databaseReference = database.getReference().child("users");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List<User> users = (List<User>) dataSnapshot.getValue(User.class);
                allUsers = users;
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public User setFirebaseUser(FirebaseUser firebaseUser) {
        DatabaseReference databaseReference = database.getReference().child("users");
        boolean isIn = false;
        User ourUser = null;

        if (allUsers == null) {
            throw new RuntimeException("set user before read all user");
        }

        for (User user : allUsers) {
            if (firebaseUser.getUid().equals(user.getUid())) {
                isIn = true;
                ourUser = user;
            }
        }

        if (!isIn) {
            User newUser = new User();
            newUser.setEmail(firebaseUser.getEmail());
            newUser.setName(firebaseUser.getDisplayName());
            newUser.setTopicList(new ArrayList<Topic>());
            newUser.setUid(firebaseUser.getUid());
            allUsers.add(newUser);
            ourUser = newUser;
        }

        databaseReference.setValue(allUsers);
        currentUser = ourUser;
        return ourUser;
    }

    public void test() {

        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");
    }
}
