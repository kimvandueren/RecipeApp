package com.example.kim.recipeapp;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface RecipeApiService {
    String BASE_URL = "https://www.food2fork.com/api/";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("search?key=347637245029931a0d729e6efcb2f389&sort=r&count=3")
    Call<Recipe> getRecipe();
}
