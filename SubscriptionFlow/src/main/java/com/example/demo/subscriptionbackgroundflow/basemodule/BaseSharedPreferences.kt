package com.example.demo.subscriptionbackgroundflow.basemodule

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor

class BaseSharedPreferences(context: Context) {
    private val mPreferences: SharedPreferences
    private val editor: Editor

    init {
        mPreferences = context.getSharedPreferences("MySetting", Context.MODE_PRIVATE)
        editor = mPreferences.edit()
    }

    var mFirstTimeApp: Int
        get() = mPreferences.getInt("firsttimeapp", 0)
        set(format) {
            editor.putInt("firsttimeapp", format)
            editor.commit()
        }

    var mActivityOpen: Boolean?
        get() = mPreferences.getBoolean("ActivityOpen", false)
        set(format) {
            editor.putBoolean("ActivityOpen", format!!)
            editor.commit()
        }

    var mOneDay:Boolean?
    get() = mPreferences.getBoolean("Oneday", false)
    set(boolen) {
        editor.putBoolean("Oneday", boolen!!)
        editor.commit()
    }
    var mTwoDay:Boolean?
        get() = mPreferences.getBoolean("Twoday", false)
        set(boolen) {
            editor.putBoolean("Twoday", boolen!!)
            editor.commit()
        }
    var mSecondTime:Boolean?
        get() = mPreferences.getBoolean("secondtime", false)
        set(boolen) {
            editor.putBoolean("secondtime", boolen!!)
            editor.commit()
        }
    var mFirstTimePremium:Boolean?
        get() = mPreferences.getBoolean("FirstTimePremium",false)
        set(boolen) {
            editor.putBoolean("FirstTimePremium", boolen!!)
            editor.commit()
        }
    var mSecondTimePremium:Boolean?
        get() = mPreferences.getBoolean("SecondTimePremium",false)
        set(boolen) {
            editor.putBoolean("SecondTimePremium", boolen!!)
            editor.commit()
        }
    var mIS_SUBSCRIBED:Boolean?
        get() = mPreferences.getBoolean("IS_SUBSCRIBED",false)
        set(boolen) {
            editor.putBoolean("IS_SUBSCRIBED", boolen!!)
            editor.commit()
        }
    var mFirstDate:String?
        get() = mPreferences.getString("FirstDate","00")
        set(str) {
            editor.putString("FirstDate", str!!)
            editor.commit()
        }
    var mOpenAdsShow:Boolean?
        get() = mPreferences.getBoolean("OpenAdsShow",false)
        set(boolen) {
            editor.putBoolean("OpenAdsShow", boolen!!)
            editor.commit()
        }

    var mOpenAdsload:Boolean?
        get() = mPreferences.getBoolean("OpenAdsload",false)
        set(boolen) {
            editor.putBoolean("OpenAdsload", boolen!!)
            editor.commit()
        }

}