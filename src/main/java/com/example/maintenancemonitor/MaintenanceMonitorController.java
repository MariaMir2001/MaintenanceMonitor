package com.example.maintenancemonitor;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
String input;
    @RequestMapping("/set")
public String setMessage(@RequestParam String input){
        return this.input=input;
}

@RequestMapping("/getSet")
public String getSetMessage(){
        return setMessage(input);
}

@RequestMapping("/reset")
public String resetMessage(){
input=null;
return input;
}

}
