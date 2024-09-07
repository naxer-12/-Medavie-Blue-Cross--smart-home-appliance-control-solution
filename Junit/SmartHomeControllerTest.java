import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class SmartHomeControllerTest {

    private SmartHomeController controller;
    private Appliance mockLight;
    private Appliance mockFan;
    private Appliance mockAC;

    @BeforeEach
    public void setUp() {
        mockLight = Mockito.mock(Appliance.class);
        mockFan = Mockito.mock(Appliance.class);
        mockAC = Mockito.mock(Appliance.class);

        List<Appliance> appliances = Arrays.asList(mockLight, mockFan, mockAC);
        controller = new SmartHomeController(appliances);
    }

    @Test
    public void testTurnOffAllAppliances() {
        controller.turnOffAllAppliances();

        verify(mockLight, times(1)).turnOff();
        verify(mockFan, times(1)).turnOff();
        verify(mockAC, times(1)).turnOff();
    }
}
