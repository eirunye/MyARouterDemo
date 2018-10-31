package com.eirunye.myarouterdemo;


import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Author Eirunye
 * Created by on 2018/10/31.
 * Describe
 */
@SuppressLint("ParcelCreator")
public class Test implements Parcelable {
    private String name;
    private String gift;

    public Test(String name, String gift) {
        this.name = name;
        this.gift = gift;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
