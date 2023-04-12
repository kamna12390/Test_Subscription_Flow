package com.scribble.animation.maker.video.effect.myadslibrary.kotlin.repository

import androidx.lifecycle.LiveData
import com.scribble.animation.maker.video.effect.myadslibrary.kotlin.db.AppDatabase
import com.scribble.animation.maker.video.effect.myadslibrary.kotlin.db.entity.AppEntity
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking

class DialogRepository(private val db : AppDatabase) {

    fun getData() : LiveData<List<AppEntity>> = runBlocking {
        coroutineScope {
            db.AppDao().getAllWithObserver()
        }
    }

}