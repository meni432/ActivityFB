package com.menisamet.activityfb.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meni on 17/08/17.
 */

public class User {
    private String uid;
    private String name;
    private String email;
    private List<Topic> topicList;
    private List<Event> userEventList;
    private String facebookUid;

    public String getFacebookUid() {
        return facebookUid;
    }

    public void setFacebookUid(String facebookUid) {
        this.facebookUid = facebookUid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Topic> getTopicList() {
        if (topicList == null) {
            topicList = new ArrayList<>();
        }
        return topicList;
    }

    public List<Event> getUserEventList() {
        if (userEventList == null) {
            userEventList = new ArrayList<>();
        }
        return userEventList;
    }

    public void setUserEventList(List<Event> userEventList) {
        this.userEventList = userEventList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }


    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", topicList=" + topicList +
                ", userEventList=" + userEventList +
                '}';
    }
}
