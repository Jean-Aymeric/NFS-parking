package com.jad;

import com.jad.parking.Car;
import com.jad.parking.Parking;
import com.jad.parking.Tank;

public class Main {

    public static void main(String[] args) {
        Parking myParking = new Parking();
        Car twingo = new Car();
        Tank charLeclerc = new Tank();

        myParking.park(twingo);
        myParking.park(charLeclerc);
    }
}
