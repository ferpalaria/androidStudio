package dmv.multiplesactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onGetNameClick(View view) {
        Intent getNameScreenIntent = new Intent(this, SecondScreen.class);

        final int result = 1;

        getNameScreenIntent.putExtra("callingActivity", "MainActivity");
//        startActivity(getNameScreenIntent);
        startActivityForResult(getNameScreenIntent,result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView userNameMessage = (TextView) findViewById(R.id.users_name_message);

        String nameSentBack = data.getStringExtra("UserName");
        userNameMessage.append(" " + nameSentBack);
    }
}
