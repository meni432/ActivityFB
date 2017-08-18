package com.menisamet.activityfb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JoinEventActivity extends AppCompatActivity {

    private Button joinButton;
    private TextView titleText;
    private TextView titleName;
    private TextView interestText;
    private TextView interestName;
    private TextView details;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_event);

        joinButton = (Button) findViewById(R.id.joinButton);
        titleText = (TextView) findViewById(R.id.title);
        titleName = (TextView) findViewById(R.id.titleName);
        interestText = (TextView) findViewById(R.id.interest);
        interestName= (TextView) findViewById(R.id.interestName);
        details = (TextView) findViewById(R.id.details);

        titleText.setText("Title");
        titleName.setText(getIntent().getStringExtra("TITLE_EVENT"));
        interestText.setText("Interest");
        interestName.setText(getIntent().getStringExtra("INTEREST_EVENT"));
        joinButton.setText("Join");
        details.setText(getIntent().getStringExtra("DETAILS_EVENT"));


        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent myIntent = new Intent(getBaseContext(), haveFunActivity.class);
//                myIntent.putExtra("USER_NAME",getIntent().getStringExtra("USER_EVENT"));
//                startActivity(myIntent);
            }
        });
    }
}