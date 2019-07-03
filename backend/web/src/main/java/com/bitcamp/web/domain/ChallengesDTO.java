package com.bitcamp.web.domain;

import com.bitcamp.web.entities.Challenges;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ChallengesDTO
 */
@Component
@Getter
@Setter
@ToString
@Lazy
public class ChallengesDTO {
    private String routineName1,routineName2,routineName3,routineName4,routineName5,challengeName;

    public Challenges toEntity(){
        return Challenges.builder()
                            .routineName1(routineName1)
                            .routineName2(routineName2)
                            .routineName3(routineName3)
                            .routineName4(routineName4)
                            .routineName5(routineName5)
                            .challengeName(challengeName)
                            .build();
    }
}