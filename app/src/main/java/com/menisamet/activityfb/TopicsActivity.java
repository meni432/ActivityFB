package com.menisamet.activityfb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TopicsActivity extends AppCompatActivity {

    private ImageButton ballGamesButton;
    private ImageButton computerGamesButton;
    private ImageButton boardGamesButton;
    private ImageButton cardGamesButton;
    private ImageButton exerciseButton;
    private ImageButton otherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        ballGamesButton = (ImageButton) findViewById(R.id.imageButtonBall);
        computerGamesButton = (ImageButton) findViewById(R.id.imageButtonComputer);
        boardGamesButton = (ImageButton) findViewById(R.id.imageButtonBoard);
        cardGamesButton = (ImageButton) findViewById(R.id.imageButtonCard);
        exerciseButton = (ImageButton) findViewById(R.id.imageButtonExercise);
        otherButton = (ImageButton) findViewById(R.id.imageButtonBackFromTopics);

        ballGamesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), topicBallSelectActivity.class);
                startActivity(intent);
            }
        });

    }
}
