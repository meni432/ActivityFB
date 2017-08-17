package com.menisamet.activityfb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class add_events extends AppCompatActivity {

    private EditText editTxt;
    private Button btn;
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;
    static final int check = 1;
    private String eventInfo;
    private String eventTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_events);


        btn = (Button) findViewById(R.id.add);
        list = (ListView) findViewById(R.id.list);
        arrayList = new ArrayList<String>();

        // Adapter: You need three parameters 'the context, id of the layout (it will be where the data is shown),
        // and the array that contains the data
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);

        // Here, you set the data in your ListView
        list.setAdapter(adapter);
        btn.setText("Add Event");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), addMenu.class);
                startActivityForResult(intent,check);
            }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getBaseContext(), eventInfo.class);
                intent.putExtra("Info", eventInfo);
                startActivity(intent);
            }
        });

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == check) {
            if (resultCode == RESULT_OK) {
                eventTitle = data.getExtras().getString("Title");
                eventInfo = data.getExtras().getString("Info");

//                arrayList.add();
                adapter.notifyDataSetChanged();

            }
        }
    }
}
//    private Button addButton;
//    private RecyclerView mRecyclerView;
//    private LinearLayoutManager mLinearLayoutManager;
//    static final int check = 1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add_events);
//
//        addButton = (Button)findViewById(R.id.add);
//        mRecyclerView = (RecyclerView) findViewById(R.id.eventList);
//        mLinearLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLinearLayoutManager);
//        addButton.setText("Add Event");
//
//        addButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TextView tv = new TextView(getApplicationContext());
//                tv.setText("AAAAAAAAAAAAAA");
//                mRecyclerView.addView(tv);
////                Intent intent = new Intent(getBaseContext(), addMenu.class);
////                startActivityForResult(intent, check);
//            }
//        });
//    }


