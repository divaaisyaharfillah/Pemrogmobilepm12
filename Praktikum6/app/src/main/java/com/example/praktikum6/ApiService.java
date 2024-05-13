package com.example.praktikum6;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("api/users")
    Call<UserResponse> getUsers(@Query("page") int page, @Query("per_page") int per_page);

    //id adalah placeholder yang akan diganti dengan nilai ID yang diberikan saat panggilan metode ini.
    @GET("api/users/{id}")
    Call<User> getUserById(@Path("id") int userId);
}
