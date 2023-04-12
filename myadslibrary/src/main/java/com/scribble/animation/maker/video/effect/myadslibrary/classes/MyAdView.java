package com.scribble.animation.maker.video.effect.myadslibrary.classes;

import android.content.Context;
import android.content.Intent;

import com.scribble.animation.maker.video.effect.myadslibrary.ui.MoreAppActivity;
import com.scribble.animation.maker.video.effect.myadslibrary.ui.MoreAppActivityNew;
import com.scribble.animation.maker.video.effect.myadslibrary.ui.NewMoreAppActivity;

public class MyAdView {

    public static MyAdView getInstance(){
        return new MyAdView();
    }

    public Intent getMoreAppIntent(Context context){
        Intent intent = new Intent(context, NewMoreAppActivity.class);
        return intent;
    }
}
