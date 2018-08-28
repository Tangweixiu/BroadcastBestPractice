package com.example.broadcastbestpractice;

import android.app.Activity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {

    private static final String TAG = "ActivityCollector";

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
        Log.d(TAG, "addActivity");
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
        Log.d(TAG, "removeActivity");
    }

    public static void finishAll() {
        for (Activity activity: activities) {
            if(!activity.isFinishing()) {
                activity.finish();
                Log.d(TAG, "finishAll");
            }
        }
    }
}
