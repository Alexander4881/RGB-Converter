package com.example.rgb_converter;

class RGBData {

    RGBData() { }

    RGBData(int red, int blue, int green) {
        red = _red;
        blue = _blue;
        green = _green;


    }

    private byte _blue;
    private byte _red;
    private byte _green;

    byte getBlue() {
        return _blue;
    }

    void setBlue(byte _blue) {
        this._blue = _blue;
    }

    byte getRed() {
        return _red;
    }

    void setRed(byte _red) {
        this._red = _red;
    }

    byte getGreen() {
        return _green;
    }

    void setGreen(byte _green) {
        this._green = _green;
    }
}
