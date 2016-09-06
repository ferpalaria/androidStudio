package dmv.multiplesactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Danilo on 02/09/2016.
 */
public class SecondScreen extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);


        Intent activityThatCalled = getIntent();
        String previousActivity = activityThatCalled.getExtras().getString("callingActivity");

        TextView callingActivityMessage = (TextView)
                findViewById(R.id.calling_activity_info_text_view);

        callingActivityMessage.append(" " + previousActivity);
    }

    public void onSendUsersName(View view) {
        EditText userNameET = (EditText) findViewById(R.id.users_name_edit_text);

        String userName = String.valueOf(userNameET.getText());

        Intent goingBack = new Intent();
        goingBack.putExtra("UserName",userName);

        setResult(RESULT_OK, goingBack);

        finish();
    }
}
