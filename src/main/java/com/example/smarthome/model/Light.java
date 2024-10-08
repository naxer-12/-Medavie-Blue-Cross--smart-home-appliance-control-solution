import org.springframework.stereotype.Component;

@Component
public class Fan implements Appliance {
    private int speed; // 0 = off, 1 = low, 2 = high

    @Override
    public void turnOn() {
        speed = 1;
        System.out.println("Fan is turned on at speed 1.");
    }

    @Override
    public void turnOff() {
        speed = 0;
        System.out.println("Fan is turned off by setting speed to 0.");
    }
}
