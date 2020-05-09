package com.company;

public class Wagon {
    public String nameOfWagon;
    Wagon previousWagon;
    Wagon nextWagon;

    Wagon (String name){
        nameOfWagon=name;
        previousWagon=null;
        nextWagon=null;
    }
}
