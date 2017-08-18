package com.menisamet.activityfb;

import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
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
    public static final String TAG = "TAG_"+Database.class.getCanonicalName();
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
                List<User> users = new ArrayList<User>();
                for (DataSnapshot userSnapshot : dataSnapshot.getChildren())
                {
                    User user = new User();
                    String uid = userSnapshot.child("uid").getValue(String.class);
                    String userName = userSnapshot.child("name").getValue(String.class);
                    GenericTypeIndicator<List<Topic>> genericTypeIndicatorTopic =new GenericTypeIndicator<List<Topic>>(){};
                    List<Topic> topicList = userSnapshot.child("topicList").getValue(genericTypeIndicatorTopic);
                    GenericTypeIndicator<List<Event>> genericTypeIndicatorEvent =new GenericTypeIndicator<List<Event>>(){};
                    List<Event> eventList = userSnapshot.child("eventList").getValue(genericTypeIndicatorEvent);

                    user.setUid(uid);
                    user.setName(userName);
                    user.setTopicList(topicList);
                    user.setUserEventList(eventList);

                    users.add(user);
                }
                allUsers = users;
                Log.d(TAG, allUsers.toString());
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
        loadAllUsers();
        DatabaseReference myRef = database.getReference("message");
        allUsers = new ArrayList<>();

        myRef.setValue("Hello, World !" + (int)(Math.random()*10));

        DatabaseReference databaseReference = database.getReference().child("users");

        User newUser = new User();
        newUser.setEmail("email@gmail.com");
        newUser.setName("test1");
        newUser.setTopicList(new ArrayList<Topic>());
        newUser.setUid("11111");
        allUsers.add(newUser);

        newUser = new User();
        newUser.setEmail("email@gmail.com");
        newUser.setName("test2");
        newUser.setTopicList(new ArrayList<Topic>());
        newUser.setUid("22222");

        Event event = new Event(9, "hi hi", 2);
        newUser.getUserEventList().add(event);
        Event event2 = new Event(1, "hi bye", 15);
        newUser.getUserEventList().add(event2);

        allUsers.add(newUser);

        databaseReference.setValue(allUsers);

    }
}
