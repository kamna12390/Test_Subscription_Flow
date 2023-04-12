package com.scribble.animation.maker.video.effect.myadslibrary.kotlin.repository

import com.scribble.animation.maker.video.effect.myadslibrary.kotlin.api.ApiHelper

class MainRepository(
        private val mApiHelper: ApiHelper
) {

    suspend fun getData() = mApiHelper.getData()

    suspend fun getIds() = mApiHelper.getIds()

}