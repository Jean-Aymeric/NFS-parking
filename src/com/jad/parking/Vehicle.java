package com.jad.parking;

public class Vehicle {
    Parking parking;

    public Vehicle() {
        this.parking = null;
    }

    public void park(Parking parking) {
        if (this.parking != parking) {
            this.parking = parking;
            parking.park(this);
        }
    }

    public void unPark() {
        if (this.parking != null) {
            this.parking.unPark(this);
        }
        this.parking = null;
    }
}
