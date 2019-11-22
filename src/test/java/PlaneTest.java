import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void getType(){
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void planeHasACapacityOf10(){
        assertEquals(10, plane.getCapacity());
    }

    @Test
    public void planeHasATotalWeightOf250(){
        assertEquals(250.00, plane.getWeight(), 0.01);
    }

}