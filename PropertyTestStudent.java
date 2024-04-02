import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PropertyTestStudent {
    Property propertyOne;
    Property propertyTwo;
    Property propertyThree;

    @Before
    public void setUp() throws Exception {
        propertyOne = new Property("Penthouse", "Bethesda", 2100.00, "Redfin", 1, 2, 3, 3);
        propertyTwo = new Property("Condominium", "Chevy Chase", 1900.00, "Zillow", 5, 4, 3, 3);
        propertyThree = new Property("Studio", "Rockville", 1800.00, "Livespace", 9, 4, 3, 3);
    }

    @After
    public void tearDown() throws Exception {
        propertyOne = null;
        propertyTwo = null;
        propertyThree = null;
    }

    @Test
    public void testGetPropertyName() {
        assertEquals("Penthouse", propertyOne.getPropertyName());
        assertEquals("Condominium", propertyTwo.getPropertyName());
        assertEquals("Studio", propertyThree.getPropertyName());
    }

    @Test
    public void testGetRentAmount() {
        assertEquals(2100.0, propertyOne.getRentAmount(), 0.0);
        assertEquals(1900.0, propertyTwo.getRentAmount(), 0.0);
        assertEquals(1800.0, propertyThree.getRentAmount(), 0.0);
    }

    @Test
    public void testGetPlot() {
        assertEquals(1, propertyOne.getPlot().getX());
        assertEquals(2, propertyOne.getPlot().getY());
        assertEquals(3, propertyOne.getPlot().getWidth());
        assertEquals(3, propertyOne.getPlot().getDepth());

        assertEquals(5, propertyTwo.getPlot().getX());
        assertEquals(4, propertyTwo.getPlot().getY());
        assertEquals(3, propertyTwo.getPlot().getWidth());
        assertEquals(3, propertyTwo.getPlot().getDepth());

        assertEquals(9, propertyThree.getPlot().getX());
        assertEquals(4, propertyThree.getPlot().getY());
        assertEquals(3, propertyThree.getPlot().getWidth());
        assertEquals(3, propertyThree.getPlot().getDepth());
    }

    @Test
    public void testToString() {
        assertEquals("Penthouse,Bethesda,Redfin,4500.0", propertyOne.toString());
        assertEquals("Condominium,Chevy Chase,Zillow,3600.0", propertyTwo.toString());
        assertEquals("Studio,Rockville,Livespace,3400.0", propertyThree.toString());
    }
}
