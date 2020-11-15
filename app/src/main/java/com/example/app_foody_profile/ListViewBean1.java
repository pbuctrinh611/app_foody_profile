package com.example.app_foody_profile;

public class ListViewBean1{
    private int image;
    private int image1;
    private int image2;
    private String title;
    private String address;
    private String range;
    private String price;
    private String time;
    private String content;


    public ListViewBean1(int image, String title, String address,String range,int image1, String price,int image2, String time, String content) {
        super();
        this.image= image;
        this.image1 = image1;
        this.image2 = image2;
        this.title=title;
        this.price=price;
        this.content=content;
        this.time=time;
        this.address=address;
        this.range = range;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage1() {
        return image1;
    }
    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }
    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) { this.address = address;}

    public String getRange() {
        return range;
    }
    public void setRange(String range) { this.range = range;}

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
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