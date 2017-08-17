package com.menisamet.activityfb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class addMenu extends AppCompatActivity {

    private Button done;
    private EditText title;
    private EditText body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_menu);

        done = (Button)findViewById(R.id.done);
        title = (EditText)findViewById(R.id.title);
        body = (EditText)findViewById(R.id.body);

        done.setText("Done");
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("Title",title.getText().toString());
                intent.putExtra("Body",body.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });


    }
}
