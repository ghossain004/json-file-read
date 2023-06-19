package com.hossain.json.controller;

import com.hossain.json.entity.Json;
import com.hossain.json.service.JsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JsonController {

    @Autowired
    private JsonService service;

    @GetMapping("/getAll")
    public Iterable<Json> getAllList(){
        return service.list();
    }
}
