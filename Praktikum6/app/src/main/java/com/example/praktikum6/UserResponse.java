package com.example.praktikum6;

import java.util.List;



public class UserResponse {
    //menyimpan daftar yg diterima oleh api yg mrpkn objek user
    private List<User> data;
    public List<User> getData() {
        return data;
    }
    public void setData(List<User> data) {
        this.data = data;
    }
}
