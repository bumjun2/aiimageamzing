package com.aiimageamzing.aiimageamzing.tests;

import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/example")
    public ResponseEntity<?> test(){
        return ResponseEntity
                .ok("안녕안녕");
    }
}