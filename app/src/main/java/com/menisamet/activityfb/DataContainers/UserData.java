package com.menisamet.activityfb.DataContainers;

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
}
