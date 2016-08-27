package com.faj.fernanda.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "CicloDeVida";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //activity_main eh um arquivo de layout / R pq é a classe de todos os resources

        Button btnBotao = (Button)findViewById(R.id.btnBotao);
        btnBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(getBaseContext(),"Click Novamente", Toast.LENGTH_SHORT).show();
            }
        });

        Log.d(TAG, "onCreate");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }


    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }


    public String getTAG() {
        return TAG;
    }
}
