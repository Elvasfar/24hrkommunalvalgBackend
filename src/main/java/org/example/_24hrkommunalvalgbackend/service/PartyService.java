package org.example._24hrkommunalvalgbackend.service;

import org.example._24hrkommunalvalgbackend.dto.PartyDTO;
import org.example._24hrkommunalvalgbackend.dto.PoliticianDTO;
import org.example._24hrkommunalvalgbackend.entity.Party;
import org.example._24hrkommunalvalgbackend.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartyService {
    @Autowired
    private PartyRepository partyRepository;

    public List<PartyDTO> getAllParties() {
        return partyRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public PartyDTO getPartyById(Long id) {
        return partyRepository.findById(id).map(this::convertToDTO).orElse(null);
    }

    public PartyDTO createParty(PartyDTO partyDTO) {
        Party party = convertToEntity(partyDTO);
        Party savedParty = partyRepository.save(party);
        return convertToDTO(savedParty);
    }

    public void deleteParty(Long id) {
        partyRepository.deleteById(id);
    }

    private PartyDTO convertToDTO(Party party) {
        PartyDTO partyDTO = new PartyDTO();
        partyDTO.setId(party.getId());
        partyDTO.setPartyName(party.getPartyName());
        partyDTO.setPartyLetter(party.getPartyLetter());
        partyDTO.setPoliticians(party.getPoliticians().stream().map(politician -> {
            PoliticianDTO politicianDTO = new PoliticianDTO();
            politicianDTO.setId(politician.getId());
            politicianDTO.setFirstName(politician.getFirstName());
            politicianDTO.setLastName(politician.getLastName());
            politicianDTO.setPartyId(party.getId());
            return politicianDTO;
        }).collect(Collectors.toList()));
        return partyDTO;
    }

    private Party convertToEntity(PartyDTO partyDTO) {
        Party party = new Party();
        party.setPartyName(partyDTO.getPartyName());
        party.setPartyLetter(partyDTO.getPartyLetter());
        return party;
    }
}
