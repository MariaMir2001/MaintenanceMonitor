package com.example.maintenancemonitor;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {

    @RequestMapping("/set")
public String setMessage(@RequestParam String input){

        return input;
}

}
