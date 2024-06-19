package org.example._24hrkommunalvalgbackend.service;

import org.example._24hrkommunalvalgbackend.dto.PoliticianDTO;
import org.example._24hrkommunalvalgbackend.entity.Politician;
import org.example._24hrkommunalvalgbackend.repository.PartyRepository;
import org.example._24hrkommunalvalgbackend.repository.PoliticianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PoliticianService {
    @Autowired
    private PoliticianRepository politicianRepository;

    @Autowired
    private PartyRepository partyRepository;

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

    public PoliticianDTO updatePolitician(Long id, PoliticianDTO politicianDTO) {
        Optional<Politician> optionalPolitician = politicianRepository.findById(id);
        if (optionalPolitician.isPresent()) {
            Politician politician = optionalPolitician.get();
            politician.setFirstName(politicianDTO.getFirstName());
            politician.setLastName(politicianDTO.getLastName());
            if (politicianDTO.getPartyId() != null) {
                partyRepository.findById(politicianDTO.getPartyId()).ifPresent(politician::setParty);
            }
            Politician updatedPolitician = politicianRepository.save(politician);
            return convertToDTO(updatedPolitician);
        } else {
            // Handle the case where the politician is not found, perhaps throw an exception
            return null;
        }
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
        if (politicianDTO.getPartyId() != null) {
            partyRepository.findById(politicianDTO.getPartyId()).ifPresent(politician::setParty);
        }
        return politician;
    }
}
