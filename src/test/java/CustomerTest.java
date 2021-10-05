import Vehicle.Vehicle;
import Vehicle.Car;
import Vehicle.Engine;
import Vehicle.EngineType;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle;
    Engine petrolEngine;
    ArrayList<Vehicle> vehicles;

    @Before
    public void before(){
        petrolEngine = new Engine(EngineType.PETROL);
        vehicle = new Car(2000, "Grey", petrolEngine);
        vehicles = new ArrayList<Vehicle>();
        customer = new Customer(6000, vehicles);
    }

    @Test
    public void customerHasMoney(){
        assertEquals(6000, customer.getMoney());
    }

    @Test
    public void customerHasNoVehiclesInVehicleArray(){
        assertEquals(0, customer.getVehicles().size());
    }

    @Test
    public void customerHasTwoVehiclesInVehicleArray(){
        customer.addVehicleToCustomer(vehicle);
        customer.addVehicleToCustomer(vehicle);
        assertEquals(2, customer.getVehicles().size());
    }

    @Test
    public void customerCanBuyVehicle(){
        customer.buyVehicle(vehicle);
        assertEquals(1, customer.getVehicles().size());
        assertEquals(4000, customer.getMoney());
    }
}
