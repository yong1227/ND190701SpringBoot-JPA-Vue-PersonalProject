package com.bitcamp.web.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Challenges
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@ToString
@Table(name = "CHALLENGES")
public class Challenges implements Serializable{

    private static final long serialVrsionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String routinName;
    private String challengeName;

    @Builder
    private Challenges(String routinName, String challengeName){
        this.routinName = routinName;
        this.challengeName = challengeName;
    }
}