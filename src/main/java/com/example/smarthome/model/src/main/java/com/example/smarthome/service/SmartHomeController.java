import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartHomeController {

    private final List<Appliance> appliances;

    public SmartHomeController(List<Appliance> appliances) {
        this.appliances = appliances;
    }

    public void turnOffAllAppliances() {
        for (Appliance appliance : appliances) {
            appliance.turnOff();
        }
        System.out.println("All appliances have been turned off.");
    }

    @Scheduled(cron = "0 0 1 1 1 *") // Runs at 1:00 AM on January 1st every year
    public void performAnnualUpdate() {
        System.out.println("Performing annual update...");
        turnOffAllAppliances();
    }
}
