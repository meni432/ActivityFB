package com.menisamet.activityfb.Models;

import android.location.Location;

import java.util.List;

/**
 * Created by meni on 17/08/17.
 */

public class Event {
    private long id;
    private String uidOwner;
    private Topic topic;
    private String subTopic;
    private int minAttendants;
    private List<String> attendantsUIDList;
    private Location location;

    public String getUidOwner() {
        return uidOwner;
    }

    public void setUidOwner(String uidOwner) {
        this.uidOwner = uidOwner;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }

    public int getMinAttendants() {
        return minAttendants;
    }

    public void setMinAttendants(int minAttendants) {
        this.minAttendants = minAttendants;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getAttendantsUIDList() {
        return attendantsUIDList;
    }

    public void setAttendantsUIDList(List<String> attendantsUIDList) {
        this.attendantsUIDList = attendantsUIDList;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}