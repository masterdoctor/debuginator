package com.clout_team.masterdoctor.debuginator;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainWindow extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_window);

    }

    public void getAvailProcesses(View view){
        int processors = Runtime.getRuntime().availableProcessors();
        Typewriter outputBox = (Typewriter) findViewById(R.id.outputBox);
        outputBox.setCharacterDelay(5);
        outputBox.animateText("> " + "Detected " + processors + " available processors" + "_");
    }

    public void viewMemory(View view){
        long freeMemory = Runtime.getRuntime().freeMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();

        Typewriter outputBox = (Typewriter) findViewById(R.id.outputBox);
        outputBox.setCharacterDelay(25);
        outputBox.animateText("> " + "Memory: " + Math.round(freeMemory / Math.pow(10, 5)) + "/" + Math.round(maxMemory / Math.pow(10, 5)) + "MB_");
    }

}
