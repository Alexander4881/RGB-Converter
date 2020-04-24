package com.example.rgb_converter;

class RGBData {

    RGBData() { }

    RGBData(int red, int blue, int green) {
        red = _red;
        blue = _blue;
        green = _green;
    }

    private int _blue;
    private int _red;
    private int _green;

    int getBlue() {
        return _blue;
    }

    void setBlue(int _blue) {
        this._blue = _blue;
    }

    int getRed() {
        return _red;
    }

    void setRed(int _red) {
        this._red = _red;
    }

    int getGreen() {
        return _green;
    }

    void setGreen(int _green) {
        this._green = _green;
    }
}
