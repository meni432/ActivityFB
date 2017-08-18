package com.menisamet.activityfb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Spinner;


public class addMenu extends AppCompatActivity {

    private Button done;
    private EditText title;
    private EditText body;
    private EditText location;
    private Spinner interest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_menu);

        done = (Button)findViewById(R.id.done);
        title = (EditText)findViewById(R.id.title);
        body = (EditText)findViewById(R.id.body);
        location = (EditText)findViewById(R.id.location);
        interest = (Spinner)findViewById(R.id.interest);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item,
                getResources().getStringArray(R.array.Interests));
        interest.setAdapter(adapter);

        done.setText("Done");
        title.setText("Event title");
        body.setText("Enter event details");
        location.setText("Enter event location");

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("Title",title.getText().toString());
                intent.putExtra("Body",body.getText().toString());
                intent.putExtra("Location",location.getText().toString());
                intent.putExtra("Interest",interest.getSelectedItem().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });


    }
}
