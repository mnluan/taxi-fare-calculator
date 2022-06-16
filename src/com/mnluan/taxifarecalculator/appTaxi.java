package com.mnluan.taxifarecalculator;

public class appTaxi extends baseFare{
    int availableDrivers;
    boolean isShared;
    boolean especial;
    String transit; // Good, Regular or Bad

    public appTaxi (int distance, int availableDrivers, boolean isShared, boolean especial, String transit){
        super(distance);
        this.availableDrivers = availableDrivers;
        this.isShared = isShared;
        this.especial = especial;
        this.transit = transit;
    }

    public double calcFare() {
        double percentage = 1;
        if (this.availableDrivers > 5)
            percentage -= 0.2;
        if (this.isShared)
            percentage -= 0.1;
        if (this.especial)
            percentage += 0.1;
        if (this.transit == "Good")
            percentage -=0.1;
        else if (this.transit == "Ruim")
            percentage += 0.1;
        return super.calcFare() * percentage;
    }
}
