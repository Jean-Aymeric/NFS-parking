package com.jad.parking;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Vehicle> parkedVehicles;

    public Parking() {
        this.parkedVehicles = new ArrayList<>();
    }

    public final void park(Vehicle vehicle) {
        if (! this.parkedVehicles.contains(vehicle)) {
            this.parkedVehicles.add(vehicle);
            vehicle.park(this);
        }
    }

    public final void unPark(Vehicle vehicle) {
        if (this.parkedVehicles.contains(vehicle)) {
            this.parkedVehicles.remove(vehicle);
            vehicle.unPark();
        }
    }
}
