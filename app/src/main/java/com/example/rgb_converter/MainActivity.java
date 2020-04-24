package com.example.rgb_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.VectorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.rgb_converter.Interfaces.Presenter;
import com.example.rgb_converter.Interfaces.View;

public class MainActivity extends AppCompatActivity implements View<RGBData> {

    private Presenter _presenter;
    private SeekBar _seekBarRed, _seekBarBlue, _seekBarGreen;
    private ImageView _imageView;
    private TextView _textViewHex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _presenter = new MainActivityPresenter(this);

        // view injection
        _seekBarRed = findViewById(R.id.seekBarRed);
        _seekBarBlue = findViewById(R.id.seekBarBlue);
        _seekBarGreen = findViewById(R.id.seekBarGreen);
        _imageView = findViewById(R.id.imageView);
        _textViewHex = findViewById(R.id.textViewHex);

        _seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                _presenter.UpdateRed((byte)progress);
                Log.e("", "onProgressChanged: " +progress);
            }
            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });
        _seekBarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                _presenter.UpdateBlue((byte)progress);

                Log.e("", "onProgressChanged: " +progress);
            }
            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });
        _seekBarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                _presenter.UpdateGreen((byte)progress);
                Log.e("", "onProgressChanged: " +progress);
            }
            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });

    }

    @Override
    public void update(RGBData rgbData) {

        //(VectorDrawable)_imageView.getDrawable().setTint();
        _imageView.setColorFilter(Color.argb(255, rgbData.getRed(), rgbData.getGreen(), rgbData.getBlue()));

        String hex = String.format("#%02x%02x%02x", rgbData.getRed(), rgbData.getGreen(), rgbData.getBlue());

        _textViewHex.setText(hex);

        Log.e("", "red: " + rgbData.getRed());
        Log.e("", "red: " + rgbData.getBlue());
        Log.e("", "red: " + rgbData.getGreen());
        // TODO update view thing rgb box
    }
}
