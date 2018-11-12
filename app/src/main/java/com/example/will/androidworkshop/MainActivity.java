package com.example.will.androidworkshop;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    private boolean game = false;
    private int score = 0;


    private Button start;
    private Button quit;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        start = (Button) findViewById(R.id.start_button);
        quit = (Button) findViewById(R.id.stop_button);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                game = true;
                start.setText(R.string.Started);
//                playGame();
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                game = false;
                start.setText(R.string.Start);
            }
        });
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
//        while (!game) { }
//            while (game) {
//                int nextButton = (int) (Math.random() * 4 + 1);
//                if (nextButton == 1) {
//                    button1.setText(R.string.click);
//                } else if (nextButton == 2) {
//                    button2.setText(R.string.click);
//                } else if (nextButton == 3) {
//                    button3.setText(R.string.click);
//                } else if (nextButton == 4) {
//                    button4.setText(R.string.click);
//                }
//            }
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
