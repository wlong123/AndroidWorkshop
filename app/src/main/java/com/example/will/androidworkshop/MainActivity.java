package com.example.will.androidworkshop;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import java.lang.Math;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    private boolean game = false;
    private int color = 0;


    private Button start;
    private Button quit;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private ConstraintLayout background;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        background = (ConstraintLayout) findViewById(R.id.background);
        start = (Button) findViewById(R.id.start_button);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = (int) (Math.random()*256);
                int blue = (int) (Math.random()*256);
                int green = (int) (Math.random()*256);
                background.setBackgroundColor(Color.rgb(red, green, blue));
            }
        });
        quit = (Button) findViewById(R.id.stop_button);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.rgb(255,255,255));
            }
        });
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.rgb(240,180,0));
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.rgb(50,50,240));
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.rgb(153,50,204));
            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.rgb(240,240,0));
            }
        });


//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                game = true;
//                start.setText(R.string.Started);
//            }
//        });
//
//        quit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                game = false;
//                start.setText(R.string.Start);
//            }
//        });
//        playGame();
    }

    public void playGame() {
        while (game) {
            int nextButton = (int)(Math.random() * 4 + 1);
            if (nextButton == 1) {
                button1.setText(R.string.click);
            }
            else if (nextButton == 2) {
                button2.setText(R.string.click);
            }
            else if (nextButton == 3) {
                button3.setText(R.string.click);
            }
            else if (nextButton == 4) {
                button4.setText(R.string.click);
            }
            game = false;
        }
    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        for(int i=0; i<10; i++){
//
//        }
//    }

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
}
