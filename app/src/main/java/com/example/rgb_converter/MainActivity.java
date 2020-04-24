package com.example.rgb_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

import com.example.rgb_converter.Interfaces.Presenter;
import com.example.rgb_converter.Interfaces.View;

public class MainActivity extends AppCompatActivity implements View<RGBData> {

    private Presenter _presenter;
    private SeekBar seekBarRed, seekBarBlue, seekBarGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _presenter = new MainActivityPresenter(this);

        // view injection
        seekBarRed = findViewById(R.id.seekBarRed);
        seekBarBlue = findViewById(R.id.seekBarBlue);
        seekBarGreen = findViewById(R.id.seekBarGreen);

        seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.e("", "onProgressChanged: " +progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }



    @Override
    public void update(RGBData rgbData) {
        // TODO update view thing rgb box
    }
}
