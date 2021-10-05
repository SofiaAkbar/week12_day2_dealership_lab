import Behaviours.IBuy;
import Vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuy {

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

    public void addVehicleToDealership(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
        this.till -= vehicle.getPrice();
    }

    public void sellVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
        this.till += vehicle.getPrice();
    }
}
