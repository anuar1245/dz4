package com.example.dz4;

public class ItemModel {
   private String fanta ;
   private String sprait ;
   private int img;

    public ItemModel(String fanta, String sprait,int img) {
        this.fanta = fanta;
        this.sprait = sprait;
        this.img = img;
    }

    public String getSprait() {
        return sprait;
    }

    public String getFanta() {
        return fanta;
    }

    public int getImg() {
        return img;
    }
}


