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
        //outputBox.setText(processors);
        outputBox.setCharacterDelay(25);
        outputBox.animateText("> " + "Detected " + processors + " available processors" + "_");
    }

}
