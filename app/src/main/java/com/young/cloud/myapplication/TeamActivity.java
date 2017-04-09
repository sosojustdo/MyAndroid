package com.young.cloud.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Team Activity
 */
public class TeamActivity extends Activity {

    private int teamAScore = 0;//A Score
    private int teamBScore = 0;//B Score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
    }

    /**
     * two score click
     * @param view
     */
    public void twoScoreClickA(View view){
        teamAScore += 2;
        this.operatScore(teamAScore, "a");
    }

    /**
     * three score click
     * @param view
     */
    public void threeScoreClickA(View view){
        teamAScore += 3;
        this.operatScore(teamAScore, "a");
    }

    /**
     * one click
     * @param view
     */
    public void oneClickA(View view){
        teamAScore += 1;
        this.operatScore(teamAScore, "a");
    }

    /**
     * two score click
     * @param view
     */
    public void twoScoreClickB(View view){
        teamBScore += 2;
        this.operatScore(teamBScore, "b");
    }

    /**
     * three score click
     * @param view
     */
    public void threeScoreClickB(View view){
        teamBScore += 3;
        this.operatScore(teamBScore, "b");
    }

    /**
     * one click
     * @param view
     */
    public void oneClickB(View view){
        teamBScore += 1;
        this.operatScore(teamBScore, "b");
    }

    /**
     * operat score
     * @param score
     * @param  team
     */
    private void operatScore(int score, String team){
        TextView scoreView = null;
        if(team.equalsIgnoreCase("a")){
            scoreView = (TextView) findViewById(R.id.team_a_score_text);
        }else if(team.equalsIgnoreCase("b")){
            scoreView = (TextView) findViewById(R.id.team_b_score_text);
        }
        scoreView.setText(String.valueOf(score));
    }

    /**
     * reset
     */
    public void reSet(View view){
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score_text);
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score_text);
        scoreViewA.setText("0");
        scoreViewB.setText("0");
    }


}
