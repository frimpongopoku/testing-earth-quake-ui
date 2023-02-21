package com.example.testing_earth_quake_ui;

public class EarthItem {
    String countryName;
    double magnitude, depth;

    public EarthItem(String countryName, double magnitude, double depth) {
        this.countryName = countryName;
        this.magnitude = magnitude;
        this.depth = depth;
    }
    public EarthItem() {

    }


    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
