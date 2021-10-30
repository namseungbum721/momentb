package com.days.momentb.personalboard.dto;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonalBoardLocationDTO {

    private String pName;

    private String pAddress;

    private String pLat;

    private String pLng;

}

