package com.example.testapi.service;

import com.example.testapi.controller.model.PlayerRequestModel;
import com.example.testapi.controller.model.PlayerResponseModel;
import com.example.testapi.converter.PlayerConverter;
import com.example.testapi.persistence.PlayerRepository;
import com.example.testapi.persistence.model.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{
    private final PlayerRepository playerRepository;
    private final PlayerConverter playerConverter;

    public PlayerServiceImpl(PlayerRepository playerRepository, PlayerConverter playerConverter) {
        this.playerRepository = playerRepository;
        this.playerConverter = playerConverter;
    }

    @Override
    public List<PlayerResponseModel> getAll() {
        List<Player> all = playerRepository.findAll();
        return playerConverter.playersToResponses(all);
    }

    @Override
    public PlayerResponseModel get(Long id) {
        Player byId = playerRepository.getById(id);
        return playerConverter.playerToResponse(byId);
    }

    @Override
    public PlayerResponseModel post(PlayerRequestModel request) {
        Player save = playerRepository.save(playerConverter.requestToPlayer(request));
        return playerConverter.playerToResponse(save);
    }

    @Override
    public PlayerResponseModel update(Long id, PlayerRequestModel request) {
        Player byId = playerRepository.getById(id);
        byId.setName(request.getName());
        byId.setClub(request.getClub());
        byId.setAge(request.getAge());
        byId.setMarket_value(request.getMarket_value());
        byId.setPosition(request.getPosition());
        Player updated = playerRepository.save(byId);
        return playerConverter.playerToResponse(updated);
    }

    @Override
    public PlayerResponseModel delete(Long id) {
        Player deleted = playerRepository.getById(id);
        playerRepository.deleteById(id);
        return playerConverter.playerToResponse(deleted);
    }
}
