package com.lucasvieira.gameslib.repository;

import com.lucasvieira.gameslib.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
