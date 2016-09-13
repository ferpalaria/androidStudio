package com.br.fpalaria.texttospeech;


import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import java.util.Locale;

import com.br.fpalaria.texttospeech.R;

public class MainActivity extends AppCompatActivity {

    TextToSpeech ttsobject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ttsobject = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener()){

            @Override
            public void OnInit(int status){

                if(status == TextToSpeech.SUCCESS) {
                    ttsobject.setLanguage(Locale.UK);

                }else{
                    Toast.makeText(getApplicationContext(),
                            "Feature not Support in Yoiur device",
                            Toast.LENGTH_LONG);
                }

            }
        };
    }

}
