package com.samuelfawcett.verx.drinkinghazards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void joinGame(View view)
    {
        Intent intent = new Intent(this, JoinGame.class);

        startActivity(intent);
    }

    public void createGame(View view)
    {
        Intent intent = new Intent(this, CreateGame.class);

        startActivity(intent);
    }
}
