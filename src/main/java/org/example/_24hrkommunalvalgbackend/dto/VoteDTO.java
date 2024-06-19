package org.example._24hrkommunalvalgbackend.dto;

import lombok.Data;

@Data
public class VoteDTO {
    private Long id;
    private Long politicianId;
    private Long partyId;
}
