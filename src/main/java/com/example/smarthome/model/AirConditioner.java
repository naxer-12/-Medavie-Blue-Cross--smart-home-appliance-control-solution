import org.springframework.stereotype.Component;

@Component
public class AirConditioner implements Appliance {
    private String mode; // "on" or "off"

    @Override
    public void turnOn() {
        mode = "on";
        System.out.println("Air Conditioner is turned on.");
    }

    @Override
    public void turnOff() {
        mode = "off";
        System.out.println("Air Conditioner is turned off by setting mode to 'off'.");
    }
}
