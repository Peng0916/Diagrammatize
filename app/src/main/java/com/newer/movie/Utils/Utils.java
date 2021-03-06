package com.newer.movie.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.StringRes;
import android.widget.Toast;

import com.newer.movie.R;
import com.newer.movie.pojo.User;

public class Utils {
    // 选项存储 *********************************************
    private static final String PREFS_NAME = "bus_settings";
    private static final int PREFS_MODE = Context.MODE_PRIVATE;

    public static void save(Context context, User user) {
        SharedPreferences preferences =
                context.getSharedPreferences(PREFS_NAME, PREFS_MODE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("id", user.getId());
        editor.putString("username", user.getUsername());
        editor.putInt("imgUser", user.getImgUser());
        editor.commit();
    }

    public static User getUser(Context context) {
        SharedPreferences preferences =
                context.getSharedPreferences(PREFS_NAME, PREFS_MODE);
        Integer id = preferences.getInt("id", 0);
        String username = preferences.getString("username", "");
        Integer imgUser = preferences.getInt("imgUser", R.mipmap.ic_launcher);
        User user = new User(id, username, "", imgUser);
        return user;
    }

    // Toast *****************************************
    public static void showToast(Context context, CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    public static void showToast(Context context, @StringRes int resId) {
        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
    }
}
