package com.example.android.bookmatbong;

public class MenuItem {

    String item_image, item_name, item_price;
    int count;

    public MenuItem() { }
    public MenuItem(String image, String name, String price, int count){
        item_image = image;
        item_name = name;
        item_price = price;
        this.count = count;
    }

    public String getItem_image() {
        return item_image;
    }

    public void setItem_image(String item_image) {
        this.item_image = item_image;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_price() {
        return item_price;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
