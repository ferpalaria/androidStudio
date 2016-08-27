package com.faj.fernanda.fragment;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import Fragment.MeuFragment;

public class MainActivity extends BaseActivity implements IFragment{

    private final String TAG = "CicloDeVida";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MeuFragment meuFragment = new MeuFragment();
        meuFragment.setListener(this);
        replaceFragment(R.id.container, meuFragment, "MeuPrimeiroFragment");

        Log.d(TAG, "onCreate - Main Activity");

    }

    @Override
    public void onClickButtonFragment (int value){
        Toast.makeText(getBaseContext(), "Value" + value, Toast.LENGTH_SHORT).show();
    }
}
