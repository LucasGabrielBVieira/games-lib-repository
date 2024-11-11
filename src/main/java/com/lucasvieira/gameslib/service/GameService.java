package com.lucasvieira.gameslib.service;

import com.lucasvieira.gameslib.entities.Game;
import com.lucasvieira.gameslib.entities.dto.GameDTO;
import com.lucasvieira.gameslib.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {
        List<Game> list = gameRepository.findAll();
        return list.stream().map(GameDTO::new).toList();
    }


}
