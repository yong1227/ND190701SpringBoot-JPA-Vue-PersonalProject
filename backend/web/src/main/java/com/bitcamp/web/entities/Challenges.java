package com.bitcamp.web.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Challenges
 */
@Component
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
@Table(name = "CHALLENGES")
public class Challenges implements Serializable{

    private static final long serialVrsionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "routine_name1")
    private String routineName1;
    @Column(name = "routine_name2")
    private String routineName2;
    @Column(name = "routine_name3")
    private String routineName3;
    @Column(name = "routine_name4")
    private String routineName4;
    @Column(name = "routine_name5")
    private String routineName5;
   
    @Column(name = "challenge_name")
    private String challengeName;


    @Builder
    private Challenges(String routineName1,String routineName2,String routineName3,String routineName4,String routineName5, String challengeName ){
        this.routineName1 = routineName1;
        this.routineName2 = routineName2;
        this.routineName3 = routineName3;
        this.routineName4 = routineName4;
        this.routineName5 = routineName5;
        this.challengeName = challengeName;
    }
}