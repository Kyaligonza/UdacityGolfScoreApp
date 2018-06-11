package com.example.android.stablefordscores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreGolferA = 0;
    int scoreGolferB = 0;
    int scoreGolferBonusA = 0;
    int scoreGolferBonusB = 0;
    int scoreGolferFinalA = 0;
    int scoreGolferFinalB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Increase the Bonus score for Team A by 1 point.
     * Increase the Final score for Team A by 1 point.
     */
    public void addOneForBonusA(View v) {
        scoreGolferBonusA = scoreGolferBonusA + 1;
        displayForGolferBonusA(scoreGolferBonusA);
        scoreGolferFinalA = scoreGolferA + scoreGolferBonusA;
        displayForGolferFinalA(scoreGolferFinalA);
    }

    /**
     * Increase the score for Team A by 1 point.
     * Increase the Final score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreGolferA = scoreGolferA + 1;
        displayForGolferA(scoreGolferA);
        scoreGolferFinalA = scoreGolferA + scoreGolferBonusA;
        displayForGolferFinalA(scoreGolferFinalA);
    }

    /**
     * Increase the score for Team A by 2 points.
     * Increase the Final score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreGolferA = scoreGolferA + 2;
        displayForGolferA(scoreGolferA);
        scoreGolferFinalA = scoreGolferA + scoreGolferBonusA;
        displayForGolferFinalA(scoreGolferFinalA);
    }
    /**
     * Increase the score for Team A by 3 points.
     * Increase the Final score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreGolferA = scoreGolferA + 3;
        displayForGolferA(scoreGolferA);
        scoreGolferFinalA = scoreGolferA + scoreGolferBonusA;
        displayForGolferFinalA(scoreGolferFinalA);
    }
    /**
     * Increase the score for Team A by 4 points.
     * Increase the Final score for Team A by 4 points.
     */
    public void addFourForTeamA(View v) {
        scoreGolferA = scoreGolferA + 4;
        displayForGolferA(scoreGolferA);
        scoreGolferFinalA = scoreGolferA + scoreGolferBonusA;
        displayForGolferFinalA(scoreGolferFinalA);
    }

    /**
     * Increase the score for Team A by 5 points.
     * Increase the Final score for Team A by 5 points.
     */
    public void addFiveForTeamA(View v) {
        scoreGolferA = scoreGolferA + 5;
        displayForGolferA(scoreGolferA);
        scoreGolferFinalA = scoreGolferA + scoreGolferBonusA;
        displayForGolferFinalA(scoreGolferFinalA);
    }
    /**
     * Increase the Bonus score for Team B by 1 point.
     * Increase the Final score for Team B by 1 point.
     */
    public void addOneForBonusB(View v) {
        scoreGolferBonusB = scoreGolferBonusB + 1;
        displayForGolferBonusB(scoreGolferBonusB);
        scoreGolferFinalB = scoreGolferB + scoreGolferBonusB;
        displayForGolferFinalB(scoreGolferFinalB);
    }

    /**
     * Increase the score for Team B by 1 point.
     * * Increase the Final score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreGolferB = scoreGolferB + 1;
        displayForGolferB(scoreGolferB);
        scoreGolferFinalB = scoreGolferB + scoreGolferBonusB;
        displayForGolferFinalB(scoreGolferFinalB);
    }

    /**
     * Increase the score for Team B by 2 points.
     * * Increase the Final score for Team B by 2 point.
     */
    public void addTwoForTeamB(View v) {
        scoreGolferB = scoreGolferB + 2;
        displayForGolferB(scoreGolferB);
        scoreGolferFinalB = scoreGolferB + scoreGolferBonusB;
        displayForGolferFinalB(scoreGolferFinalB);

    }
    /**
     * Increase the score for Team B by 3 points.
     * * Increase the Final score for Team B by 3 point.
     */
    public void addThreeForTeamB(View v) {
        scoreGolferB = scoreGolferB + 3;
        displayForGolferB(scoreGolferB);
        scoreGolferFinalB = scoreGolferB + scoreGolferBonusB;
        displayForGolferFinalB(scoreGolferFinalB);
    }
    /**
     * Increase the score for Team B by 4 points.
     * * Increase the Final score for Team B by 4 point.
     */
    public void addFourForTeamB(View v) {
        scoreGolferB = scoreGolferB + 4;
        displayForGolferB(scoreGolferB);
        scoreGolferFinalB = scoreGolferB + scoreGolferBonusB;
        displayForGolferFinalB(scoreGolferFinalB);
    }
    /**
     * Increase the score for Team B by 5 points.
     * * Increase the Final score for Team B by 5 point.
     */
    public void addFiveForTeamB(View v) {
        scoreGolferB = scoreGolferB + 5;
        displayForGolferB(scoreGolferB);
        scoreGolferFinalB = scoreGolferB + scoreGolferBonusB;
        displayForGolferFinalB(scoreGolferFinalB);
    }
    /**
     * Reset all the score for Team A and B.
     */
    public void setToZero(View v) {
        scoreGolferA = 0;
        scoreGolferB = 0;
        scoreGolferBonusA = 0;
        scoreGolferBonusB = 0;
        displayForGolferA(scoreGolferA);
        displayForGolferB(scoreGolferB);
        displayForGolferBonusA(scoreGolferBonusA);
        displayForGolferBonusB(scoreGolferBonusB);
    }
    /**
     * Displays the given score for Team A Bonus.
     */
    public void displayForGolferBonusA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.golfer_a_score_bonus);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B Bonus.
     */
    public void displayForGolferBonusB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.golfer_b_score_bonus);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForGolferA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.golfer_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForGolferB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.golfer_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Final score for Team A.
     */
    public void displayForGolferFinalA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.golfer_a_score_final);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Final score for Team A.
     */
    public void displayForGolferFinalB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.golfer_b_score_final);
        scoreView.setText(String.valueOf(score));
    }
}
