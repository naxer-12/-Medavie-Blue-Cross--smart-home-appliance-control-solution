import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplianceController {

    private final SmartHomeController smartHomeController;

    public ApplianceController(SmartHomeController smartHomeController) {
        this.smartHomeController = smartHomeController;
    }

    @PostMapping("/turnOffAll")
    public String turnOffAll() {
        smartHomeController.turnOffAllAppliances();
        return "All appliances have been turned off.";
    }

    //  Add more REST endpoints here for turning specific appliances on/off.
}
