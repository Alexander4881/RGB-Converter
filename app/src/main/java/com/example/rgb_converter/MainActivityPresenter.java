package com.example.rgb_converter;

import com.example.rgb_converter.Interfaces.Observer;
import com.example.rgb_converter.Interfaces.Presenter;
import com.example.rgb_converter.Interfaces.View;

public class MainActivityPresenter implements Presenter, Observer<RGBData> {

    private View _view;
    private RGB _rgb;

    // Constructor
    MainActivityPresenter(View view){
        _view = view;
        _rgb = new RGB(new RGBData());
        _rgb.addObserver(this);
    }

    @Override
    public void UpdateRed(byte red) {
        _rgb.setRed(red);
    }

    @Override
    public void UpdateBlue(byte blue) {
        _rgb.setBlue(blue);
    }

    @Override
    public void UpdateGreen(byte green) {
        _rgb.setGreen(green);
    }

    @Override
    public void update(RGBData rgbData) {
        _view.update(rgbData);
    }
}
