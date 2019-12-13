package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Plant {
    public String name;
    public int daysToWater;
    public LocalDate waterDate;

    public Plant(String name, int daysToWater) {
        this.name = name;
        this.daysToWater = daysToWater;
        //this.waterDate = LocalDate.of(2019, Month.DECEMBER, 16);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysToWater() {
        return daysToWater;
    }

    public void setDaysToWater(int daysToWater) {
        this.daysToWater = daysToWater;
    }
}
