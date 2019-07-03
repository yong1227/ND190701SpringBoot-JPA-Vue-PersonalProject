package com.bitcamp.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    Challenges challenges;
    @Autowired
    ChallengesDTO challengesDTO;
    @Autowired
    ChallengesRepository challengesRepository;
    @Autowired
    ModelMapper modelMapper;

    @Bean
    public ModelMapper mapper(){
        return modelMapper = new ModelMapper();
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
        challengesRepository.save(challenges);
        map.put("result", "SUCCESS");

        return map;
    }

    //findAll
    @GetMapping("")
    public List<ChallengesDTO> findAll() {
        Iterable<Challenges> entities = challengesRepository.findAll();
        List<ChallengesDTO> list = new ArrayList<>();

        for(Challenges ch : entities){
            challengesDTO = modelMapper.map(ch, ChallengesDTO.class);
            list.add(challengesDTO);
        }
        System.out.println(list);
        return list;
    }

    //find By Id
    @GetMapping("/find/{id}")
    public ChallengesDTO findById(@PathVariable Long id){
        return modelMapper.map(challengesRepository.findById(id), ChallengesDTO.class);
    }

    //update By Id
    @PutMapping("/{id}")
    public HashMap<String,String> update(@PathVariable String id, @RequestBody ChallengesDTO dto) {
    
        HashMap<String, String> map = new HashMap<>();

        Challenges entity = challengesRepository.findById(Long.parseLong(id)).get();
        entity.setRoutineName1(dto.getRoutineName1());
        entity.setRoutineName2(dto.getRoutineName2());
        entity.setRoutineName3(dto.getRoutineName3());
        entity.setRoutineName4(dto.getRoutineName4());
        entity.setRoutineName5(dto.getRoutineName5());
        challengesRepository.save(entity);
        map.put("result ","success");
        return map;
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        challengesRepository.deleteById(Long.parseLong(id));
    }
}