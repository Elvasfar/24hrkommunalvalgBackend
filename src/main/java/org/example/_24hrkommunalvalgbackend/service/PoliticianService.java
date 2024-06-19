package org.example._24hrkommunalvalgbackend.service;

import org.example._24hrkommunalvalgbackend.dto.PoliticianDTO;
import org.example._24hrkommunalvalgbackend.entity.Politician;
import org.example._24hrkommunalvalgbackend.repository.PoliticianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PoliticianService {
    @Autowired
    private PoliticianRepository politicianRepository;

    public List<PoliticianDTO> getAllPoliticians() {
        return politicianRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public PoliticianDTO getPoliticianById(Long id) {
        return politicianRepository.findById(id).map(this::convertToDTO).orElse(null);
    }

    public PoliticianDTO createPolitician(PoliticianDTO politicianDTO) {
        Politician politician = convertToEntity(politicianDTO);
        Politician savedPolitician = politicianRepository.save(politician);
        return convertToDTO(savedPolitician);
    }

    public void deletePolitician(Long id) {
        politicianRepository.deleteById(id);
    }

    private PoliticianDTO convertToDTO(Politician politician) {
        PoliticianDTO politicianDTO = new PoliticianDTO();
        politicianDTO.setId(politician.getId());
        politicianDTO.setFirstName(politician.getFirstName());
        politicianDTO.setLastName(politician.getLastName());
        politicianDTO.setPartyId(politician.getParty().getId());
        return politicianDTO;
    }

    private Politician convertToEntity(PoliticianDTO politicianDTO) {
        Politician politician = new Politician();
        politician.setFirstName(politicianDTO.getFirstName());
        politician.setLastName(politicianDTO.getLastName());
        // You should fetch the Party entity by id and set it here
        // This requires you to have a reference to PartyRepository in this service
        return politician;
    }
}
