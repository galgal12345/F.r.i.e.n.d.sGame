package com.drillgil.android.FriendsGame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int countSaveMeButtonTeamA = 0;
    private int countSaveMeButtonTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * the logic behind the click on Team A.
     */
    public void threePointsTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void saveMeTeamA(View view) {
        Button btn = (Button)findViewById(R.id.button2_team_a);
        btn.setText(String.valueOf(++countSaveMeButtonTeamA));
    }

    public void minusThreePointsTeamA(View view) {
        scoreTeamA = scoreTeamA - 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * the logic behind the click on Team B.
     */
    public void threePointsTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void saveMeTeamB(View view) {
        Button saveMeButtonTeamB = (Button)findViewById(R.id.button2_team_b);
        saveMeButtonTeamB.setText(String.valueOf(++countSaveMeButtonTeamB));
    }

    public void minusThreePointsTeamB(View view) {
        scoreTeamB = scoreTeamB - 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset Score
     */
    public void resetButton(View view) {
        TextView winner = (TextView) findViewById(R.id.the_winner);

        Button btnA = (Button)findViewById(R.id.button2_team_a);
        Button btnB = (Button)findViewById(R.id.button2_team_b);

        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        winner.setText("");

        btnA.setText("\uD83D\uDC7BSave Me\uD83D\uDC7B");
        btnB.setText("\uD83D\uDC7BSave Me\uD83D\uDC7B");

    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        TextView winner = (TextView) findViewById(R.id.the_winner);

        scoreView.setText(String.valueOf(score));

        if(score>=10) { winner.setText("The Winner Is Team A🏆"); }
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        TextView winner = (TextView) findViewById(R.id.the_winner);

        scoreView.setText(String.valueOf(score));

        if(score>=10) { winner.setText("The Winner Is Team B🏆"); }

    }

    /**
     *
     * When Random Player was clicked a mission will appear
     */
    public void playerNumber(View view) {

        final int min = 1;
        final int max = 6;
        final int random = new Random().nextInt((max - min) + 1) + min;
        display(random);
        displayMessage(random);

    }

    private void display(int rand) {
        TextView randomNum = (TextView) findViewById(R.id.random_num);
        randomNum.setText(String.valueOf(rand));
    }

    private void displayMessage(int rand){
        TextView q = findViewById(R.id.random_quastion);

        switch (rand){
            case 1:q.setText("You need to put one of the grooming products on your face and say: I'm a little pretty girl");
                break;
            case 2:q.setText("You need to do the Monica’s 1-7 Explanation");
                break;
            case 3:q.setText("pivot, pivot,PIVOOOT! shut up, shut up,SHUT UUUUP! You need to drink 2 shots of vodka\n*Save Me*");
                break;
            case 4:q.setText("You need to dance the Monica’s NYE dance choose 1 of your partners and do the dance");
                break;
            case 5:q.setText("every player in the game should take a glass of water spit it on his friend and say something tragic  like its a Days of our Lives show.\n*Save Me*");
                break;
            case 6:q.setText("You need to do to one of the customers the ungai style");
                break;

        }
    }

    public void resetSaveMeBtnTeamA(View view) {
        Button btnA = (Button)findViewById(R.id.button2_team_a);
        countSaveMeButtonTeamA = 0;
        countSaveMeButtonTeamB = 0;
        btnA.setText("\uD83D\uDC7BSave Me\uD83D\uDC7B");
    }

    public void resetSaveMeBtnTeamB(View view) {
        Button btnB = (Button)findViewById(R.id.button2_team_b);
        countSaveMeButtonTeamA = 0;
        countSaveMeButtonTeamB = 0;
        btnB.setText("\uD83D\uDC7BSave Me\uD83D\uDC7B");


    }
}