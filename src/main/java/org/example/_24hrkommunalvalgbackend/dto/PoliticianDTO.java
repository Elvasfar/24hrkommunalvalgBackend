package org.example._24hrkommunalvalgbackend.dto;

import lombok.Data;

@Data
public class PoliticianDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Long partyId;
}
