import Vehicle.Car;
import Vehicle.Engine;
import Vehicle.EngineType;
import Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Vehicle vehicle;
    Engine petrolEngine;
    ArrayList<Vehicle> vehicles;

    @Before
    public void before(){
        petrolEngine = new Engine(EngineType.PETROL);
        vehicle = new Car(2000, "Grey", petrolEngine);
        vehicles = new ArrayList<Vehicle>();
        dealership = new Dealership(10000, vehicles);
    }

    @Test
    public void DealershipHasTill(){
        assertEquals(10000, dealership.getTill());
    }

    @Test
    public void dealershipHasNoVehiclesInVehicleArray(){
        assertEquals(0, dealership.getVehicles().size());
    }

    @Test
    public void dealershipHasTwoVehiclesInVehicleArray(){
        dealership.addVehicleToDealership(vehicle);
        dealership.addVehicleToDealership(vehicle);
        assertEquals(2, dealership.getVehicles().size());
    }

    @Test
    public void dealershipCanBuyVehicle(){
        dealership.buyVehicle(vehicle);
        dealership.buyVehicle(vehicle);
        assertEquals(2, dealership.getVehicles().size());
        assertEquals(6000, dealership.getTill());
    }

    @Test
    public void dealershipCanSellVehicle(){
        dealership.buyVehicle(vehicle);
        dealership.buyVehicle(vehicle);
        dealership.sellVehicle(vehicle);
        assertEquals(1, dealership.getVehicles().size());
        assertEquals(8000, dealership.getTill());
    }
}
