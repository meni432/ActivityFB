package com.menisamet.activityfb;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.igalata.bubblepicker.BubblePickerListener;
import com.igalata.bubblepicker.adapter.BubblePickerAdapter;
import com.igalata.bubblepicker.model.BubbleGradient;
import com.igalata.bubblepicker.model.PickerItem;
import com.igalata.bubblepicker.rendering.BubblePicker;

import org.jetbrains.annotations.NotNull;

public class InterestsActivity extends AppCompatActivity {

    private BubblePicker picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        picker = (BubblePicker)findViewById(R.id.picker);


        final String[] titles = getResources().getStringArray(R.array.interests);
        final TypedArray colors = getResources().obtainTypedArray(R.array.colors);
        final TypedArray images = getResources().obtainTypedArray(R.array.images);

        picker.setAdapter(new BubblePickerAdapter() {
            @Override
            public int getTotalCount() {
                return titles.length;
            }

            @NotNull
            @Override
            public PickerItem getItem(int position) {
                PickerItem item = new PickerItem();
                item.setTitle(titles[position]);
                item.setGradient(new BubbleGradient(colors.getColor((position * 2) % 8, 0),
                        colors.getColor((position * 2) % 8 + 1, 0), BubbleGradient.VERTICAL));
                item.setTypeface(Typeface.DEFAULT);
                item.setTextColor(ContextCompat.getColor(InterestsActivity.this, android.R.color.white));
                item.setBackgroundImage(ContextCompat.getDrawable(InterestsActivity.this, images.getResourceId(position, 0)));
                return item;
            }
        });

        picker.setListener(new BubblePickerListener() {
            @Override
            public void onBubbleSelected(@NotNull PickerItem item) {
                //TODO: add interest to user
                //TODO: update DB
            }

            @Override
            public void onBubbleDeselected(@NotNull PickerItem item) {
                //TODO: remove interest to user
                //TODO: update DB
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        picker.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        picker.onPause();
    }


    public void goToExplore(View view) {
        Intent intent = new Intent(this, MyLocationActivity.class);
        startActivity(intent);
    }
}
