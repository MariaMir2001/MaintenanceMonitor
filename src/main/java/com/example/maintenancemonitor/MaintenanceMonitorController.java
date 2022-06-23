package com.example.maintenancemonitor;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
   MaintenanceMonitor a=new MaintenanceMonitor();

    @RequestMapping("/set")
    public String setMessage(@RequestParam String input) {
        return a.setMessage(input);
    }

    @RequestMapping("/deliver")
    public String deliverMessage() {
        return a.deliverMessage();
    }

    @RequestMapping("/reset")
    public String resetMessage() {
        return a.resetMessage();
    }

}
