package com.brioal.selectabletextview;

import android.view.View;

import java.util.Calendar;

/**
 * email:brioal@foxmail.com
 * github:https://github.com/Brioal
 * Created by Brioal on 11/4/2017.
 */

public abstract class OnWordClickListener {
    public static final int MIN_CLICK_DELAY_TIME = 1000;
    private long lastClickTime = 0;

    public void onClick(String word) {
        long currentTime = Calendar.getInstance().getTimeInMillis();
        if (currentTime - lastClickTime > MIN_CLICK_DELAY_TIME) {
            lastClickTime = currentTime;
            onNoDoubleClick(word);
        }
    }

    protected abstract void onNoDoubleClick(String word);

}
