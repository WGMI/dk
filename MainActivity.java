package com.example.mugandaimo.xando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {//implements View.OnClickListener{

    boolean player1 = true;

    public void click(View v){
        Button b = (Button) v;
        b.setTextSize(60f);

        if(player1){
            b.setText("X");
        } else{
            b.setText("O");
        }

        player1 = !player1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String buttonID = "space_" + i + j;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                //buttons[i][j] = findViewById(resID);
                //buttons[i][j].setOnClickListener(this);
            }
        }
    }
}
