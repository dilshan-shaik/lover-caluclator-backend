package com.flames.flames.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flames.flames.dto.LoveRequest;
import com.flames.flames.entity.LoveResult;
import com.flames.flames.service.LoveService;

@RestController
@RequestMapping("/love")
@CrossOrigin(origins = "http://localhost:5173")
public class LoveController {

    private final LoveService service;

    public LoveController(LoveService service) {
        this.service = service;
    }

    @PostMapping("/calculate")
    public LoveResult calculate(
            @RequestBody LoveRequest request) {

        return service.calculateAndSave(
                request.getName1(),
                request.getName2()
        );
    }
}
