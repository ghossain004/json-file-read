package com.hossain.json.service;

import com.hossain.json.entity.Json;
import com.hossain.json.repository.JsonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsonService {

    @Autowired
    private JsonRepository repository;

    public Iterable<Json> save(List<Json> jsons){
        return repository.saveAll(jsons);
    }

    public Json save(Json json){
        return repository.save(json);
    }

    public Iterable<Json> list(){
        return repository.findAll();
    }
}
