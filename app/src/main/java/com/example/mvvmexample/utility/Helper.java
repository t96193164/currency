package com.example.mvvmexample.utility;


import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodManager;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * Created by Mohammad Azam Khan on 17/12/2022.
 */
public class Helper {

    private static Helper sharedHelper = null;
    private Typeface robotoRegularFont, robotoMediumFont, robotoBoldFont;
    private String mLangCode;
    private String mCountryCode;

    public static Helper getSharedHelper() {
        if (sharedHelper == null) {
            sharedHelper = new Helper();

            sharedHelper.robotoBoldFont = null;
        }
        return sharedHelper;
    }


    public void initFonts(Activity activity) {
        try {
//                sharedHelper.robotoRegularFont = Typeface.createFromAsset(activity.getAssets(), "fonts" +
//                        "/roboto_regular.ttf");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getmLangCode() {
        return mLangCode;
    }

    public void setmLangCode(String mLangCode) {
        this.mLangCode = mLangCode;
    }

    public String getmCountryCode() {
        return mCountryCode;
    }

    public void setmCountryCode(String mCountryCode) {
        this.mCountryCode = mCountryCode;
    }

    public Typeface getRobotoRegularFont() {
        return robotoRegularFont;
    }

    public Typeface getRobotoMediumFont() {
        return robotoMediumFont;
    }

    public Typeface getRobotoBoldFont() {
        return robotoBoldFont;
    }

    public static float dpFromPx(final Context context, final float px) {
        return px / context.getResources().getDisplayMetrics().density;
    }

    public static void hideSoftKeyBoard(Activity activity) {
        try {
            if (activity != null && activity.getCurrentFocus() != null) {
                InputMethodManager inputManager = (InputMethodManager) activity.
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getScreenWidth(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int getScreenHeight(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public String getDate(String dateString) {
        //2023-04-03T10:13:24.619918Z
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        String dateconvert = "";
        DateFormat out = null;
        try {
            Date date = formatter.parse(dateString);
            out = new SimpleDateFormat("d MMM, yyyy HH:mm", Locale.US);
            dateconvert = out.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateconvert;
    }
}
