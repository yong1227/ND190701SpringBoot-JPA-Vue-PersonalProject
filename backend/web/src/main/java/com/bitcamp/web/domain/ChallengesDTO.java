package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * ChallengesDTO
 */
@Component
@Data
@Lazy
public class ChallengesDTO {
    private String routinName,
                    challengeName;
}