package com.example.android.footballscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Global declaration to track points for each team
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method for displaying updates to Team A score
     * @param score
     */
    public void teamAScoreTotalDisplay (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_points_txt);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Method for displaying updates to Team B score
     * @param score
     */
    public void teamBScoreTotalDisplay (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_points_txt);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team A method to add touchdown and update TextView
     */
    public void addTouchdownTeamA (View view) {
        scoreTeamA += 6;
        teamAScoreTotalDisplay(scoreTeamA);
    }

    /**
     * Team B method to add touchdown and update TextView
     */
    public void addTouchdownTeamB (View view) {
        scoreTeamB += 6;
        teamBScoreTotalDisplay(scoreTeamB);
    }

    /**
     * Team A method to add field goal and update TextView
     */
    public void addFieldGoalTeamA (View view) {
        scoreTeamA += 3;
        teamAScoreTotalDisplay(scoreTeamA);
    }

    /**
     * Team B method to add field goal and update TextView
     */
    public void addFieldGoalTeamB (View view) {
        scoreTeamB += 3;
        teamBScoreTotalDisplay(scoreTeamB);
    }

    /**
     * Team A method to add two points (extra points or touchback) and update TextView
     */
    public void addTwoPointsTeamA (View view) {
        scoreTeamA += 2;
        teamAScoreTotalDisplay(scoreTeamA);
    }

    /**
     * Team B Method to add two points (extra points or touchback) and update TextView
     */
    public void addTwoPointsTeamB (View view) {
        scoreTeamB += 2;
        teamBScoreTotalDisplay(scoreTeamB);
    }

    /**
     * Team A method to add one point and update TextView
     */
    public void addOnePointTeamA (View view) {
        scoreTeamA += 1;
        teamAScoreTotalDisplay(scoreTeamA);
    }

    /**
     * Team B method to add one point and update TextView
     */
    public void addOnePointTeamB (View view) {
        scoreTeamB += 1;
        teamBScoreTotalDisplay(scoreTeamB);
    }

    /**
     * Method resets scores to 0 and updates TextViews for both team a and team b
     */
    public void trackerReset (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        teamAScoreTotalDisplay(scoreTeamA);
        teamBScoreTotalDisplay(scoreTeamB);
    }

}
