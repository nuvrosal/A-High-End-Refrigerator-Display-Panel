package com.example.servingwebcontent;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureAdjustmentTest {

    // Test successful temperature save
    @Test
    public void testTemperatureSavedCorrectly() {

        TemperatureControl tc = new TemperatureControl();

        tc.setTemperature(37);

        // verify the temperature was saved
        assertEquals(37, tc.getTemperature());
    }

    // Test invalid temperature is rejected
    @Test
    public void testTemperatureSaveError() {

        TemperatureControl tc = new TemperatureControl();

        // verify invalid temperature causes an error
        assertThrows(IllegalArgumentException.class, () -> {
            tc.setTemperature(200);
        });
    }
}
