package com.hossain.json.controller;

import com.hossain.json.entity.Json;
import com.hossain.json.service.JsonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class JsonController {

    @Autowired
    private JsonService service;

    @GetMapping("/getAll")
    public Iterable<Json> getAllList(){
        return service.list();
    }

    //just to read json data and file in a single api, not to store in db
    @PostMapping("/post")
    public ResponseEntity<?> addUserInformation(@RequestParam MultipartFile file, @RequestParam("userData") String userData){
        log.info("add file information {}", file.getOriginalFilename());
        log.info("add user information {}", userData);
        return ResponseEntity.ok("added successful");
    }
}
