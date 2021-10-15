package com.example.testapi.service;

import com.example.testapi.controller.model.PlayerRequestModel;
import com.example.testapi.controller.model.PlayerResponseModel;

import java.util.List;

public interface PlayerService {
    List<PlayerResponseModel> getAll();
    PlayerResponseModel get(Long id);
    PlayerResponseModel post(PlayerRequestModel request);
    PlayerResponseModel update(Long id, PlayerRequestModel request);
    PlayerResponseModel delete(Long id);
}
