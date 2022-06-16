package com.mnluan.taxifarecalculator;

public class regularTaxi extends baseFare {
    int taxMode; // 1(day) or 2(night)
    static double baseTax = 5.5;

    public regularTaxi (int distance, int taxMode) {
        super(distance);
        this.taxMode = taxMode;
    }

    public double calcFare() {
        if (this.taxMode == 1){
            return regularTaxi.baseTax + super.calcFare();
        } else {
            return regularTaxi.baseTax + (this.distance * 3);
        }
    }
}
