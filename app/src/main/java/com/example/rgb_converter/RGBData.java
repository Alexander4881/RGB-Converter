package com.example.rgb_converter;

public class RGBData {

    RGBData() { }

    RGBData(byte red, byte blue, byte green) {
        red = _red;
        blue = _blue;
        green = _green;
    }

    private byte _blue;
    private byte _red;
    private byte _green;

    public byte getBlue() {
        return _blue;
    }

    public void setBlue(byte _blue) {
        this._blue = _blue;
    }

    public byte getRed() {
        return _red;
    }

    public void setRed(byte _red) {
        this._red = _red;
    }

    public byte getGreen() {
        return _green;
    }

    public void setGreen(byte _green) {
        this._green = _green;
    }
}
