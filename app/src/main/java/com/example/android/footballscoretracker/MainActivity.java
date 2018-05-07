package com.example.android.footballscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamAScoreTotalDisplay (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_points_txt);
        scoreView.setText(String.valueOf(score));
    }

    public void teamBScoreTotalDisplay (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_points_txt);
        scoreView.setText(String.valueOf(score));
    }

    public void addTouchdownTeamA (View view) {
        scoreTeamA += 6;
        teamAScoreTotalDisplay(scoreTeamA);
    }

    public void addTouchdownTeamB (View view) {
        scoreTeamB += 6;
        teamBScoreTotalDisplay(scoreTeamB);
    }

    public void addFieldGoalTeamA (View view) {
        scoreTeamA += 3;
        teamAScoreTotalDisplay(scoreTeamA);
    }

    public void addFieldGoalTeamB (View view) {
        scoreTeamB += 3;
        teamBScoreTotalDisplay(scoreTeamB);
    }

    public void trackerReset (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        teamAScoreTotalDisplay(scoreTeamA);
        teamBScoreTotalDisplay(scoreTeamB);
    }

}

