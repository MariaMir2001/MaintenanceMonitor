package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class MaintenanceMonitor {

        String input;


        public String setMessage( String input) {
            return this.input = input;
        }


        public String deliverMessage() {
            return input;
        }


        public String resetMessage() {
            input = null;
            return input;
        }

    }


