package com.example.accuardi18.carstereo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class CarStereoLab extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener{

    Switch powerSwitch;
    TextView tunerDisplay;
    Button volUp;
    Button volDown;
    ToggleButton amFmToggle;
    Button tunerUpButton;
    Button tunerDownButton;
    int[] amPresets = {550,600,650,700,750,800};
    int[] fmPresets = {909,929,949,969,989,1009};
    Button preset1;
    Button preset2;
    Button preset3;
    Button preset4;
    Button preset5;
    Button preset6;

    boolean isFM = true;
    int fmStation= 881;
    int amStation = 530;
    String stationText = "";





    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_stereo_lab);
        powerSwitch = (Switch)findViewById(R.id.PowerSwitchToggle);

        tunerDisplay = (TextView) findViewById(R.id.stationDisplay);
        volUp = (Button)findViewById(R.id.VolumeUpButton);
        volDown = (Button)findViewById(R.id.VolumeDownButton);
        amFmToggle = (ToggleButton)findViewById(R.id.amfmToggleButton);
        tunerUpButton = (Button)findViewById(R.id.tunerUp);
        tunerDownButton = (Button)findViewById(R.id.tunerDown);

        preset1 = (Button)findViewById(R.id.StationPreset1);
        preset1.setOnLongClickListener(this);

        preset2 = (Button)findViewById(R.id.StationPreset2);
        preset2.setOnLongClickListener(this);

        preset3 = (Button)findViewById(R.id.StationPreset3);
        preset3.setOnLongClickListener(this);

        preset4 = (Button)findViewById(R.id.StationPreset4);
        preset4.setOnLongClickListener(this);

        preset5 = (Button)findViewById(R.id.StationPreset5);
        preset5.setOnLongClickListener(this);

        preset6 = (Button)findViewById(R.id.StationPreset6);
        preset6.setOnLongClickListener(this);
    }

    public void preset1 (View view){
        if(isFM){
            fmStation = fmPresets[0];
            stationText=((double)fmStation/10+"");
        }
        else{
            amStation = amPresets[0];
            stationText=(amStation+"");
        }
        tunerDisplay.setText(stationText);
    }

    public void preset2 (View view){
        if(isFM){
            fmStation = fmPresets[1];
            stationText=((double)fmStation/10+"");
        }
        else{
            amStation = amPresets[1];
            stationText=(amStation+"");
        }
        tunerDisplay.setText(stationText);
    }

    public void preset3 (View view){
        if(isFM){
            fmStation = fmPresets[2];
            stationText=((double)fmStation/10+"");
        }
        else{
            amStation = amPresets[2];
            stationText=(amStation+"");
        }
        tunerDisplay.setText(stationText);
    }

    public void preset4 (View view){
        if(isFM){
            fmStation = fmPresets[3];
            stationText=((double)fmStation/10+"");
        }
        else{
            amStation = amPresets[3];
            stationText=(amStation+"");
        }
        tunerDisplay.setText(stationText);
    }

    public void preset5 (View view){
        if(isFM){
            fmStation = fmPresets[4];
            stationText=((double)fmStation/10+"");
        }
        else{
            amStation = amPresets[4];
            stationText=(amStation+"");
        }
        tunerDisplay.setText(stationText);
    }

    public void preset6 (View view){
        if(isFM){
            fmStation = fmPresets[5];
            stationText=((double)fmStation/10+"");
        }
        else{
            amStation = amPresets[5];
            stationText=(amStation+"");
        }
        tunerDisplay.setText(stationText);
    }

    public void amfmToggle (View view){
        if(amFmToggle.isChecked()){
            isFM = true;
            stationText=((double)fmStation/10+"");

        }
        else{
            isFM = false;
            stationText=(amStation+"");
        }

        tunerDisplay.setText(stationText);
    }

    public void tunerUpButton (View view){
        if(tunerUpButton.isPressed()) {
            if (isFM) {
                if (fmStation == 1079) {
                    fmStation = 881;

                } else {
                    fmStation = fmStation + 2;
                    Log.i("",fmStation+"");
                }
                stationText=((double)fmStation/10+"");
            }
            else {
                if (amStation == 1700) {
                    amStation = 530;

                } else {
                    amStation = amStation + 10;
                    tunerDisplay.setText(stationText);
                }
                stationText=(amStation+"");
            }

        }
        tunerDisplay.setText(stationText);
    }

    public void tunerDownButton (View view){
        if(tunerDownButton.isPressed()) {
            if (isFM) {
                if (fmStation == 881) {
                    fmStation = 1079;
                } else {
                    fmStation = fmStation - 2;
                }
                stationText=((double)fmStation/10+"");
            }
            else {
                if (amStation == 530) {
                    amStation = 1700;
                } else {
                    amStation = amStation - 10;
                }
                stationText=(amStation+"");
            }
        }
        tunerDisplay.setText(stationText);
    }

    public void powerButton(View view) {
        Log.i("Hello","World!!!");

        if(powerSwitch.isChecked()) {

            volUp.setBackgroundColor(Color.WHITE);
            volDown.setBackgroundColor(Color.WHITE);
            tunerDisplay.setTextColor(Color.WHITE);
            amFmToggle.setBackgroundColor(Color.WHITE);

        }
        else {
            volUp.setBackgroundColor(Color.BLACK);
            volDown.setBackgroundColor(Color.BLACK);
            tunerDisplay.setTextColor(Color.BLACK);
            amFmToggle.setBackgroundColor(Color.BLACK);
        }

    }


    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onLongClick(View view) {
        if (isFM) {
            if (view.equals(preset1)) {
                fmPresets[0]=fmStation;
            }
            else if (view.equals(preset2)) {
                fmPresets[1]=fmStation;
            }
            else if (view.equals(preset3)) {
                fmPresets[2]=fmStation;
            }
            else if (view.equals(preset4)) {
                fmPresets[3]=fmStation;
            }
            else if (view.equals(preset5)) {
                fmPresets[4]=fmStation;
            }
            else if (view.equals(preset6)) {
                fmPresets[5]=fmStation;
            }

        }
        else {
            if (view.equals(preset1)) {
                amPresets[0]=amStation;
            }
            else if (view.equals(preset2)) {
                amPresets[1]=amStation;
            }
            else if (view.equals(preset3)) {
                amPresets[2]=amStation;
            }
            else if (view.equals(preset4)) {
                amPresets[3]=amStation;
            }
            else if (view.equals(preset5)) {
                amPresets[4]=amStation;
            }
            else if (view.equals(preset6)) {
                amPresets[5]=amStation;
            }

        }
        return true;
    }
}

