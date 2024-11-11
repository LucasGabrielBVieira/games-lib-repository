package com.lucasvieira.gameslib.entities.dto;

import com.lucasvieira.gameslib.entities.Game;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class GameDTO {

    private Long id;
    private String title;
    private String shortDescription;
    private Long year;
    private String imgUrl;

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
