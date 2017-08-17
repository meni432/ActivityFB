package com.menisamet.activityfb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class eventInfo extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_info);

        tv = (TextView)findViewById(R.id.info);

        String details = getIntent().getStringExtra("Info");
        tv.setText(details);
    }
}
