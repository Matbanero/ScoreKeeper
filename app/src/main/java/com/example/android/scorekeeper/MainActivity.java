package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int onTargetA = 0;
    int onTargetB = 0;
    int foulsA = 0;
    int foulsB = 0;
    int cornersA = 0;
    int cornersB = 0;

    public void displayGoalForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_scoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void add_goal_to_A (View view){
        scoreTeamA = scoreTeamA + 1;
        displayGoalForTeamA(scoreTeamA);
    }

    public void displayGoalForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_score_B);
        scoreView.setText(String.valueOf(score));
    }

    public void add_goal_to_B (View view){
        scoreTeamB = scoreTeamB + 1;
        displayGoalForTeamB(scoreTeamB);
    }
    /**
     * these methods add score and display it for both team A and team B
     */

    public void displayShotForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.shots_on_targetA);
        scoreView.setText(String.valueOf(score));
    }

    public void add_shot_to_A (View view){
        onTargetA = onTargetA + 1;
        displayShotForTeamA(onTargetA);
    }

    public void displayShotForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.shots_on_target_B);
        scoreView.setText(String.valueOf(score));
    }

    public void add_shot_to_B (View view){
        onTargetB = onTargetB + 1;
        displayShotForTeamB(onTargetB);
    }
    /**
     * Changes and displays shots on target for both teams
     */

    public void displayFoulForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_scoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void add_foul_to_A (View view){
        foulsA = foulsA + 1;
        displayFoulForTeamA(foulsA);
    }

    public void displayFoulForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_score_B);
        scoreView.setText(String.valueOf(score));
    }

    public void add_foul_to_B (View view){
        foulsB = foulsB + 1;
        displayFoulForTeamB(foulsB);
    }
    /**
     * Adds and displays fouls for both teams
     */

    public void displayCornersForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_scoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void add_corner_to_A (View view){
        cornersA = cornersA + 1;
        displayCornersForTeamA(cornersA);
    }

    public void displayCornersForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_score_B);
        scoreView.setText(String.valueOf(score));
    }

    public void add_corner_to_B (View view){
        cornersB = cornersB + 1;
        displayCornersForTeamB(cornersB);
    }
    /**
     * adds corners for both teams
     */

    public void reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        onTargetB = 0;
        onTargetA = 0;
        cornersB = 0;
        cornersA = 0;
        foulsB = 0;
        foulsA = 0;
        displayGoalForTeamA(scoreTeamA);
        displayCornersForTeamA(cornersA);
        displayCornersForTeamB(cornersB);
        displayFoulForTeamA(foulsA);
        displayShotForTeamA(onTargetA);
        displayShotForTeamB(onTargetB);
        displayFoulForTeamB(foulsB);
        displayGoalForTeamB(scoreTeamB);
    }
}
