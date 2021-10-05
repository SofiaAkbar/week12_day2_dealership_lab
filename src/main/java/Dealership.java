import Vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<Vehicle> vehicles;

    public Dealership(int till, ArrayList<Vehicle> vehicles) {
        this.till = till;
        this.vehicles = vehicles;
    }

    public int getTill() {
        return till;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
