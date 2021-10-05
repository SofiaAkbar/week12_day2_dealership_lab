import Vehicle.Engine;
import Vehicle.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(EngineType.ELECTRIC);
    }

    @Test
    public void hasEngineType(){
        assertEquals(EngineType.ELECTRIC, engine.getEngineType());
    }
}
