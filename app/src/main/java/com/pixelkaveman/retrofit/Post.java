package com.pixelkaveman.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Abhinav Singh on 07-11-2019
 */
public class Post {

    public int userId;

    private int id;

    private String title;

    @SerializedName("body")
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
