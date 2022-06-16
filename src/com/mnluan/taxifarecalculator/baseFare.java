package com.mnluan.taxifarecalculator;

public class baseFare {

    int distance;

    public baseFare (int distance) {
        this.distance = distance;
    }

    public double calcFare() {
        return this.distance * 2.5;
    }

}
