import Vehicle.Vehicle;
import Vehicle.Car;
import Vehicle.ElectricCar;
import Vehicle.HybridCar;
import Vehicle.Engine;
import Vehicle.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VehicleTest {

    Vehicle car;
    Vehicle electricCar;
    Vehicle hybridCar;
    Engine petrolEngine;
    Engine electricEngine;
    Engine hybridEngine;

    @Before
    public void before(){
        petrolEngine = new Engine(EngineType.PETROL);
        car = new Car(2000, "Grey", petrolEngine);

        electricEngine = new Engine(EngineType.ELECTRIC);
        electricCar = new ElectricCar(4000, "White", electricEngine);

        hybridEngine = new Engine(EngineType.HYBRID);
        hybridCar = new HybridCar(3000, "Red", hybridEngine);
    }

    @Test
    public void petrolCarHasEngine(){
        assertEquals(EngineType.PETROL, car.getEngine().getEngineType());
    }

    @Test
    public void petrolCarHasPrice(){
        assertEquals(2000, car.getPrice());
    }

    @Test
    public void petrolCarHasColour(){
        assertEquals("Grey", car.getColour());
    }

    


}
