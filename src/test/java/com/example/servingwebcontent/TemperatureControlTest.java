import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.servingwebcontent.TemperatureControl;

public class TemperatureControlTest {

    @Test
    public void testSetValidTemperature() {
        TemperatureControl tc = new TemperatureControl();
        tc.setTemperature(35); // valid
        assertEquals(35, tc.getTemperature());
    }

    @Test
    public void testSetInvalidTemperature() {
        TemperatureControl tc = new TemperatureControl();
        assertThrows(IllegalArgumentException.class, () -> {
            tc.setTemperature(200); // invalid
        });
    }
}
