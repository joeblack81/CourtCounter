package com.example.android.courtcounter;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    int teamAScorecurrent =0;
    int teamAScorePrevious = 0;
    int teamBScore = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayScoreA(teamAScorecurrent);
        displayScoreB(teamBScore);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void displayScoreA(int score){

        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));


    }


    public void displayScoreB(int score){

        TextView scoreViewB = (TextView) findViewById(R.id.teamBScore);
        scoreViewB.setText(String.valueOf(score));


    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.teamA2points:
// handle button A click;
                teamAScorecurrent = teamAScorecurrent +2;
                teamAScorePrevious = teamAScorecurrent - 2;
                displayScoreA(teamAScorecurrent);
                break;

            case R.id.teamA3points:
// handle button B click;
                teamAScorecurrent = teamAScorecurrent +3;
                teamAScorePrevious = teamAScorecurrent - 3;
                displayScoreA(teamAScorecurrent);
                break;

            case R.id.teamA1point:
// handle button B click;
                teamAScorecurrent = teamAScorecurrent +1;
                teamAScorePrevious = teamAScorecurrent - 1;
                displayScoreA(teamAScorecurrent);
                break;
            


            default:
                throw new RuntimeException("Unknow button ID");
        }
    }


    public void add2ForTeamB(View view){
        teamBScore = teamBScore +2;
        displayScoreB(teamBScore);
    }

    public void add3ForTeamB(View view){
        teamBScore = teamBScore +3;
        displayScoreB(teamBScore);
    }

    public void add1ForTeamB(View view){
        teamBScore = teamBScore +1;
        displayScoreB(teamBScore);
    }

    public void reset(View view){
        teamAScorecurrent = 0;
        teamBScore = 0;
        displayScoreA(teamAScorecurrent);
        displayScoreB(teamBScore);
    }

    public void undo(View view){
        teamAScorecurrent = teamAScorePrevious;
        displayScoreA(teamAScorecurrent);
    }

}
