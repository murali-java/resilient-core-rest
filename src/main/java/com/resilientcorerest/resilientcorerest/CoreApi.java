package com.resilientcorerest.resilientcorerest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreApi {

    private boolean toggle = false;

    @GetMapping("hitApi")
    public ResponseEntity<String> hitApi(){
        System.out.println("Got Request !!!");
        HttpStatus status = toggle? HttpStatus.OK: HttpStatus.SERVICE_UNAVAILABLE;
        return new ResponseEntity<>("response from core api "+status.toString(), status);
    }

    @GetMapping("toggle")
    public void toggle(){
        toggle = !toggle;
    }
}
