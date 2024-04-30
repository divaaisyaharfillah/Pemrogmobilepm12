package com.example.praktikum3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Story implements Parcelable {

    private String nama;
    private Integer image;

    public Story(String nama, Integer image) {
        this.nama = nama;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }


    protected Story(Parcel in) {
        nama=in.readString();
        if(in.readByte()==0){
            image=null;
        }else{
            image=in.readInt();
        }
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int flags) {
        parcel.writeString(nama);
        if(image==null){
            parcel.writeByte((byte)0);
        }else{
            parcel.writeByte((byte)1);
            parcel.writeInt(image);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Story> CREATOR = new Creator<Story>() {
        @Override
        public Story createFromParcel(Parcel in) {
            return new Story(in);
        }

        @Override
        public Story[] newArray(int size) {
            return new Story[size];
        }
    };
}

