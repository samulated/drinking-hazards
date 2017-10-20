package com.samuelfawcett.verx.drinkinghazards;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainGame extends AppCompatActivity {

    Boolean running = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);
    }

    protected void onStart()
    {
        super.onStart();


    }

    /**
     * Processes input from server, queues feedback (animations and sounds) and response to server
     * Event Types:
     * Utility       0  |0 - null               |1 - ping               |2 - message            |
     *                  |3 - enter game         |4 -                    |5 - leave game         |
     *                  |9 - error              |
     *
     *      ---         -
     *
     * Question Rnd  1  |0 - begin question rnd |1 - wait (start)       |2 - draw card          |
     *                  |3 - ask question       |4 - wait (question)    |5 - buzzer             |
     *                  |6 - vote Y/N           |7 - winner prompt      |8 - you won prompt     |
     *                  |9 - error              |
     * Dare Rnd      2  |0 -
     *
     * Punish Rnd    3  |
     *
     * Wildcard Rnd  4  |
     *
     * Final Rnd     5  |
     *
     *      ---         -
     *
     * Reward Use    6  |
     *
     * Scoring       7  |
     *
     *
     *
     */
    protected void parseEvent()
    {
        int eventCode = 0;

    }

    public void changeEvent(int eventType)
    {
        // if current event is the same as new event, do nothing

        // else turn all events' views off
            // then load in the relevant info (card, etc)
            // and turn on appropriate event view


    }

}
