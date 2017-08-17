package com.menisamet.activityfb.Models;

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
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }
}
