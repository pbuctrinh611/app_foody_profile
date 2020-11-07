package com.example.app_foody_profile;

public class ListViewBean {
    private int image;
    private String title;
    private String content;
    private String time;


    public ListViewBean(int image, String title, String content, String time) {
        super();
        this.image = image;
        this.title=title;
        this.content=content;
        this.time=time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}