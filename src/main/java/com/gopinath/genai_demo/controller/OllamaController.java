package com.gopinath.genai_demo.controller;

import com.gopinath.genai_demo.service.OllamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/genai")
public class OllamaController {

    @Autowired
    OllamaService ollamaService;

    @GetMapping(path = "/")
    public ResponseEntity<?> welcome() {
        return new ResponseEntity<>("Welcome to Gen AI Services", HttpStatus.OK);
    }


    @GetMapping(path = "/askme/{inputQuestion}")
    public ResponseEntity<?> askMe(@PathVariable String inputQuestion) {
        String response = ollamaService.askMe(inputQuestion);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
