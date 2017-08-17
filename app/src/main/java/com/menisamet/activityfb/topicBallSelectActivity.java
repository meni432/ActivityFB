package com.menisamet.activityfb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class topicBallSelectActivity extends AppCompatActivity {

    private CheckBox boxSoccer;
    private CheckBox boxTennis;
    private CheckBox boxBasket;
    private CheckBox boxPingpong;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_ball_select);
        boxBasket = (CheckBox) findViewById(R.id.checkBoxBasketball);
        boxTennis = (CheckBox) findViewById(R.id.checkBoxTennis);
        boxSoccer = (CheckBox) findViewById(R.id.checkBoxSoccer);
        boxPingpong = (CheckBox) findViewById(R.id.checkBoxPingPong);
        buttonSave = (Button) findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



}
