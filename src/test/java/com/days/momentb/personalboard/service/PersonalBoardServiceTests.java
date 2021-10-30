package com.days.momentb.personalboard.service;

import com.days.momentb.personalboard.dto.PersonalBoardDTO;
import com.days.momentb.personalboard.dto.PersonalBoardLocationDTO;
import com.days.momentb.personalboard.repository.PersonalBoardRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class PersonalBoardServiceTests {

    @Autowired
    private PersonalBoardService personalBoardService;

    @Test
    public void testModify(){
        PersonalBoardDTO personalBoardDTO = PersonalBoardDTO.builder().pbNo(200L).pbContent("gg")
                .build();

        personalBoardService.modify(personalBoardDTO);
    }

    @Test
    public void testRegister(){

        List<PersonalBoardLocationDTO> locations = IntStream.rangeClosed(1,5).mapToObj(j -> {
            PersonalBoardLocationDTO location = PersonalBoardLocationDTO.builder()
                    .pName("서울역")
                    .pAddress("주소: " + j )
                    .pLat("192.1802333")
                    .pLng("998828282")

                    .build();

            return location;
        }).collect(Collectors.toList());

        PersonalBoardDTO boardDTO = PersonalBoardDTO.builder()
                .locations(locations)
                .build();

       personalBoardService.register(boardDTO);

    }



}
