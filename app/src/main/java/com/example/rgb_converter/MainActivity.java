package com.example.rgb_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rgb_converter.Interfaces.Presenter;
import com.example.rgb_converter.Interfaces.View;

public class MainActivity extends AppCompatActivity implements View<RGBData> {

    private Presenter _presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _presenter = new MainActivityPresenter(this);
    }

    @Override
    public void update(RGBData rgbData) {
        // TODO update view thing rgb box

    }
}
