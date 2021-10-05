import Behaviours.IBuy;
import Vehicle.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuy {

    private int money;
    private ArrayList<Vehicle> vehicles;
    private Dealership dealership;

    public Customer(int money, ArrayList<Vehicle> vehicles) {
        this.money = money;
        this.vehicles = vehicles;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicleToCustomer(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle){
        this.money -= vehicle.getPrice();
        this.vehicles.add(vehicle);
    }

    public void buyVehicleFromDealership(Vehicle vehicle, Dealership dealership){
        dealership.sellVehicle(vehicle);
        this.buyVehicle(vehicle);
    }

}
