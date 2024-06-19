package org.example._24hrkommunalvalgbackend.controller;

import org.example._24hrkommunalvalgbackend.dto.PartyDTO;
import org.example._24hrkommunalvalgbackend.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parties")
public class PartyController {
    @Autowired
    private PartyService partyService;

    @GetMapping
    public List<PartyDTO> getAllParties() {
        return partyService.getAllParties();
    }

    @GetMapping("/{id}")
    public PartyDTO getPartyById(@PathVariable Long id) {
        return partyService.getPartyById(id);
    }

    @PostMapping
    public PartyDTO createParty(@RequestBody PartyDTO partyDTO) {
        return partyService.createParty(partyDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteParty(@PathVariable Long id) {
        partyService.deleteParty(id);
    }
}
