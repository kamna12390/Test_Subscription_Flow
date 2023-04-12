package com.scribble.animation.maker.video.effect.myadslibrary.interfaces;

import com.scribble.animation.maker.video.effect.myadslibrary.Response;
import com.scribble.animation.maker.video.effect.myadslibrary.model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("more_app")
    Call<ResponseModel> getAllApp();

    @GET("application/679")
    Call<Response> getAllAppNew();

}
