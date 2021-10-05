import Vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> vehicles;

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
}
