package com.example.rgb_converter;

import com.example.rgb_converter.Interfaces.Observable;
import com.example.rgb_converter.Interfaces.Observer;

import java.util.ArrayList;

public class RGB implements Observable<RGBData> {

    // Attributes
    private RGBData _rgbData;
    private ArrayList<Observer> _observers = new ArrayList<>();

    // Constructor
    RGB(RGBData rgbData) {
        this._rgbData = rgbData;
    }

    // Functions
    void setBlue(byte _blue) {
        this._rgbData.setBlue(_blue);
        notifyObservers(this._rgbData);
    }

    void setRed(byte _red) {
        this._rgbData.setRed(_red);
        notifyObservers(this._rgbData);

    }

    void setGreen(byte _green) {
        this._rgbData.setGreen(_green);
        notifyObservers(this._rgbData);
    }


    @Override
    public void addObserver(Observer obs) {
        _observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        _observers.remove(obs);
    }

    @Override
    public void notifyObservers(RGBData rgbData) {
        for (Observer item:_observers) {
            item.update(rgbData);
        }
    }

    public RGBData getRGB() {
        return _rgbData;
    }
}
