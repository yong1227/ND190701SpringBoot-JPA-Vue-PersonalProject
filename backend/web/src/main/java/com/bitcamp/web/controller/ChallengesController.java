package com.bitcamp.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.bitcamp.web.common.lambda.ISupplier;
import com.bitcamp.web.domain.ChallengesDTO;
import com.bitcamp.web.entities.Challenges;
import com.bitcamp.web.repositories.ChallengesRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


/**
 * ChallengesController
 */
@RestController
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RequestMapping("/challenges")
public class ChallengesController {

    @Autowired
    Challenges entity;
    @Autowired
    ChallengesDTO dto;
    @Autowired
    ChallengesRepository repo;
    @Autowired
    ModelMapper mapper;

    @Bean
    public ModelMapper mapper(){
        return mapper = new ModelMapper();
    }

    // form insert
    @PostMapping("")
    public HashMap<String,String> save(@RequestBody ChallengesDTO challengesDTO) {
        System.out.println("save로 진입");
        HashMap<String ,String> map = new HashMap<>();

        Challenges challenges  = new Challenges();
        challenges.setChallengeName(challengesDTO.getChallengeName());
        challenges.setRoutineName1(challengesDTO.getRoutineName1());
        challenges.setRoutineName2(challengesDTO.getRoutineName2());
        challenges.setRoutineName3(challengesDTO.getRoutineName3());
        challenges.setRoutineName4(challengesDTO.getRoutineName4());
        challenges.setRoutineName5(challengesDTO.getRoutineName5());

        System.out.println("엔티티로 바뀐 정보 : " + challenges.toString());
        repo.save(challenges);
        map.put("result", "SUCCESS");

        return map;
    }

    //findAll
    @GetMapping("/findAll")
    public List<ChallengesDTO> findAll() {
        Iterable<Challenges> entities = repo.findAll();
        List<ChallengesDTO> list = new ArrayList<>();

        for(Challenges ch : entities){
            dto = mapper.map(ch, ChallengesDTO.class);
            list.add(dto);
        }
        System.out.println(list);
        return list;
    }

    //find By Id
    @GetMapping("/find/{id}")
    public ChallengesDTO findById(@PathVariable String id){
        System.out.println("findById 진입");
        Challenges entity = repo.findById(Long.parseLong(id))
                                    .orElseThrow(EntityNotFoundException::new);
        System.out.println(">>>" + entity.toString());
        ChallengesDTO dto = mapper.map(entity, ChallengesDTO.class);
        System.out.println("조회 결과: "+entity.toString());
        return dto;
    }
    
    //update By Id
    @PutMapping("/{id}")
    public HashMap<String,String> update(@PathVariable String id, @RequestBody ChallengesDTO dto) {
    
        HashMap<String, String> map = new HashMap<>();

        Challenges entity = repo.findById(Long.parseLong(id)).get();
        entity.setRoutineName1(dto.getRoutineName1());
        entity.setRoutineName2(dto.getRoutineName2());
        entity.setRoutineName3(dto.getRoutineName3());
        entity.setRoutineName4(dto.getRoutineName4());
        entity.setRoutineName5(dto.getRoutineName5());
        repo.save(entity);
        map.put("result ","success");
        return map;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(Long.parseLong(id));
    }
}