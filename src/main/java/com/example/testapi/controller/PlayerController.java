package com.example.testapi.controller;

import com.example.testapi.controller.model.PlayerRequestModel;
import com.example.testapi.controller.model.PlayerResponseModel;
import com.example.testapi.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/player")
public class PlayerController {
    private final PlayerService service;

    public PlayerController(PlayerService service) {
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<PlayerResponseModel>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<PlayerResponseModel> get(@PathVariable Long id){
        return ResponseEntity.ok(service.get(id));
    }
    @PostMapping
    public ResponseEntity<PlayerResponseModel> post(@RequestBody PlayerRequestModel request){
        return ResponseEntity.ok(service.post(request));
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<PlayerResponseModel> update(@PathVariable Long id, @RequestBody PlayerRequestModel request){
        return ResponseEntity.ok(service.update(id,request));
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<PlayerResponseModel> delete(@PathVariable Long id){
        return ResponseEntity.ok(service.delete(id));
    }
}
