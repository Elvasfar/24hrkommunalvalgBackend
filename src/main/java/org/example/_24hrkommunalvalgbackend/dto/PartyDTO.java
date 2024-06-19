package org.example._24hrkommunalvalgbackend.dto;

import lombok.Data;
import java.util.List;

@Data
public class PartyDTO {
    private Long id;
    private String partyName;
    private String partyLetter;
    private List<PoliticianDTO> politicians;
}
