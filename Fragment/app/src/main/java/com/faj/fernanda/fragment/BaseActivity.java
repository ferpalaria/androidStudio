package com.faj.fernanda.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {

    private final String TAG = "INSERT_FRAGMENT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void replaceFragment(int containerViewId, Fragment fragment, String tag){
        FragmentManager fs = this.getSupportFragmentManager();

            fs.beginTransaction().replace(containerViewId, fragment, tag).commit();
        Log.d(TAG, "replaceFragment"+fragment.getClass().getSimpleName()+"], tag["+tag+"]");

    }
}
