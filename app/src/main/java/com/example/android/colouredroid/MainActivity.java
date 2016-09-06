package com.example.android.colouredroid;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        setNewColours();

    }

    int newNum;

    /**
     * Generate and set colours
     */
    public void setNewColours () {

        //Generate and set main colour
        Random rndA, rndR, rndG, rndB, rndNum;
        rndA = rndR = rndG = rndB = rndNum = new Random();
        int newA = rndA.nextInt(180);
        int newR = rndR.nextInt(230 - 10) + 10;
        int newG = rndG.nextInt(230 - 10) + 10;
        int newB = rndB.nextInt(230 - 10) + 10;
        int mainColour = Color.argb(newA, newR, newG, newB);


        findViewById(R.id.colouredRobot).setBackgroundColor(mainColour);

        //Decide the answer button and set the main colour
        newNum = rndNum.nextInt(9 - 1) + 1;
        findViewById(getResources()
                .getIdentifier("answerOpt0" + newNum, "id", getPackageName()))
                .setBackgroundColor(mainColour);

        //Calculate A, R, G and B values for generate sub colours for other buttons
        int subA01, subA02, subR01, subR02, subG01, subG02, subB01, subB02;

        if (newA <= 150 && newA >= 30) {
             subA01 = newA + 30;
             subA02 = newA - 30;
        } else if (newA > 150) {
             subA01 = newA - 30;
             subA02 = newA - 60;
        } else {
             subA01 = newA + 30;
             subA02 = newA + 60;
        }

        if (newR <= 225 && newR >= 30) {
             subR01 = newR + 30;
             subR02 = newR - 30;
        } else if (newR > 225) {
             subR01 = newR - 30;
             subR02 = newR - 60;
        } else {
             subR01 = newR + 30;
             subR02 = newR + 60;
        }

        if (newG <= 225 && newG >= 30) {
             subG01 = newG + 30;
             subG02 = newG - 30;
        } else if (newG > 225) {
             subG01 = newG - 30;
             subG02 = newG - 60;
        } else {
             subG01 = newG + 30;
             subG02 = newG + 60;
        }

        if (newB <= 225 && newB >= 30) {
             subB01 = newB + 30;
             subB02 = newB - 30;
        } else if (newB > 225) {
             subB01 = newB - 30;
             subB02 = newB - 60;
        } else {
             subB01 = newB + 30;
             subB02 = newB + 60;
        }

        //Generate sub colours for other buttons
        int subColour01 = Color.argb(subA01, newR, newG, newB);
        int subColour02 = Color.argb(subA02, newR, newG, newB);
        int subColour03 = Color.argb(newA, subR01, newG, newB);
        int subColour04 = Color.argb(newA, subR02, newG, newB);
        int subColour05 = Color.argb(newA, newR, subG01, newB);
        int subColour06 = Color.argb(newA, newR, subG02, newB);
        int subColour07 = Color.argb(newA, newR, newG, subB01);
        int subColour08 = Color.argb(newA, newR, newG, subB02);

        //Set sub colours to other buttons
        int subColourList[] = {subColour01, subColour03, subColour05, subColour07, subColour02, subColour04, subColour06,subColour08};

        int j = 0;

        for (int i = 1; i < 10; ++i) {

            if (i != newNum) {
                findViewById(getResources()
                        .getIdentifier("answerOpt0" + i, "id", getPackageName()))
                        .setBackgroundColor(subColourList[j]);
                j = j + 1;
            }

        }

    }

    //Show toast when the answer is correct
    public void showCorrectToast() {
        Toast toast = Toast.makeText(getApplicationContext(),"Correct! Challenge the next colour!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    //Show toast when the answer is incorrect
    public void showIncorrectToast() {
        Toast toast = Toast.makeText(getApplicationContext(),"Incorrect... Try again!!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    //Validate the answer and clicked button
    public void answerOpt01(View view) {
        if (newNum == 1) {
            showCorrectToast();
            setNewColours();
        } else {
            showIncorrectToast();
        }
    }

    public void answerOpt02(View view) {
        if (newNum == 2) {
            showCorrectToast();
            setNewColours();
        } else {
            showIncorrectToast();
        }
    }

    public void answerOpt03(View view) {
        if (newNum == 3) {
            showCorrectToast();
            setNewColours();
        } else {
            showIncorrectToast();
        }
    }

    public void answerOpt04(View view) {
        if (newNum == 4) {
            showCorrectToast();
            setNewColours();
        } else {
            showIncorrectToast();
        }
    }

    public void answerOpt05(View view) {
        if (newNum == 5) {
            showCorrectToast();
            setNewColours();
        } else {
            showIncorrectToast();
        }
    }

    public void answerOpt06(View view) {
        if (newNum == 6) {
            showCorrectToast();
            setNewColours();
        } else {
            showIncorrectToast();
        }
    }

    public void answerOpt07(View view) {
        if (newNum == 7) {
            showCorrectToast();
            setNewColours();
        } else {
            showIncorrectToast();
        }
    }

    public void answerOpt08(View view) {
        if (newNum == 8) {
            showCorrectToast();
            setNewColours();
        } else {
            showIncorrectToast();
        }
    }

    public void answerOpt09(View view) {
        if (newNum == 9) {
            showCorrectToast();
            setNewColours();
        } else {
            showIncorrectToast();
        }
    }

}
