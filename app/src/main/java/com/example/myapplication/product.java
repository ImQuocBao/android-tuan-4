package com.example.myapplication;

public class product {
    private String name, ncc;
    private int mainImg;

    public product(String name, String ncc, int mainImg) {
        this.name = name;
        this.ncc = ncc;
        this.mainImg = mainImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNcc() {
        return ncc;
    }

    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

    public int getMainImg() {
        return mainImg;
    }

    public void setMainImg(int mainImg) {
        this.mainImg = mainImg;
    }
}
