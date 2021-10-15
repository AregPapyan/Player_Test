package com.example.testapi.converter;

import com.example.testapi.controller.model.PlayerRequestModel;
import com.example.testapi.controller.model.PlayerResponseModel;
import com.example.testapi.persistence.model.Player;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlayerConverter {
    public PlayerResponseModel playerToResponse(Player player){
        PlayerResponseModel response = new PlayerResponseModel();
        response.setId(player.getId());
        response.setName(player.getName());
        response.setClub(player.getClub());
        response.setAge(player.getAge());
        response.setMarket_value(player.getMarket_value());
        response.setPosition(player.getPosition());
        return response;
    }
    public List<PlayerResponseModel> playersToResponses(List<Player> players){
        List<PlayerResponseModel> responses = new ArrayList<>();
        for(Player player:players){
            responses.add(playerToResponse(player));
        }
        return responses;
    }
    public Player requestToPlayer(PlayerRequestModel request){
        Player player = new Player();
        player.setName(request.getName());
        player.setClub(request.getClub());
        player.setAge(request.getAge());
        player.setMarket_value(request.getMarket_value());
        player.setPosition(request.getPosition());
        return player;
    }
}
