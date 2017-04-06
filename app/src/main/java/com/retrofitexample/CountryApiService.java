package com.retrofitexample;

import retrofit2.http.GET;

/**
 * Created by houss on 06/04/17.
 */
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface CountryApiService{
    @GET("all")
    Call<List<Country>> getListCountry();


}
