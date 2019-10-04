package com.example.szorgalmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
        implements SeekBar.OnSeekBarChangeListener
{
    private SeekBar sbrRed;
    private SeekBar sbrGreen;
    private SeekBar sbrBlue;

    private TextView text_Red;
    private TextView text_Green;
    private TextView text_Blue;

    private TextView txtNewColor;

    int red=0,green=0,blue =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbrRed = findViewById(R.id.sbr_Red);
        sbrGreen = findViewById(R.id.sbr_Green);
        sbrBlue = findViewById(R.id.sbr_Blue);
        txtNewColor = findViewById(R.id.txt_New_Color);
        text_Red = findViewById(R.id.text_Red);
        text_Green = findViewById(R.id.text_Green);
        text_Blue = findViewById(R.id.text_Blue);


        sbrRed.setOnSeekBarChangeListener(this);
        sbrGreen.setOnSeekBarChangeListener(this);
        sbrBlue.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b){

        switch (seekBar.getId()){
            case R.id.sbr_Red: red=i; break;
            case R.id.sbr_Green: green=i; break;
            case R.id.sbr_Blue: blue=i; break;
        }
        txtNewColor.setBackgroundColor(Color.rgb(red,green,blue));
        text_Red.setText("R: "+red);
        text_Green.setText("G: "+green);
        text_Blue.setText("B: "+blue);
    }

    @Override
    public void onStartTrackingTouch (SeekBar seekBar){



    }
    @Override
    public void  onStopTrackingTouch (SeekBar seekBar){

       //text_Red.setText(red);
       //text_Green.setText(green);
       //text_Blue.setText(blue);

    }

}
