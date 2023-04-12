package com.scribble.animation.maker.video.effect.myadslibrary.kotlin.api

import com.scribble.animation.maker.video.effect.myadslibrary.kotlin.model.ResponseID
import com.scribble.animation.maker.video.effect.myadslibrary.kotlin.model.ResponseModel
import retrofit2.http.GET

interface ApiService {

    @GET("more_app")
    suspend fun getAllApp(): ResponseModel

    @GET("advertisement_list")
    suspend fun getIDs() : ResponseID

}
