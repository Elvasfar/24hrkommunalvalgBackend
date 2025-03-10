package org.example._24hrkommunalvalgbackend.controller;

import org.example._24hrkommunalvalgbackend.dto.PoliticianDTO;
import org.example._24hrkommunalvalgbackend.service.PoliticianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/politicians")
public class PoliticianController {
    @Autowired
    private PoliticianService politicianService;

    @GetMapping
    public List<PoliticianDTO> getAllPoliticians() {
        return politicianService.getAllPoliticians();
    }

    @GetMapping("/{id}")
    public PoliticianDTO getPoliticianById(@PathVariable Long id) {
        return politicianService.getPoliticianById(id);
    }

    @PostMapping
    public PoliticianDTO createPolitician(@RequestBody PoliticianDTO politicianDTO) {
        return politicianService.createPolitician(politicianDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePolitician(@PathVariable Long id) {
        politicianService.deletePolitician(id);
    }

    @PutMapping("/{id}")
    public PoliticianDTO updatePolitician(@PathVariable Long id, @RequestBody PoliticianDTO politicianDTO) {
        return politicianService.updatePolitician(id, politicianDTO);
    }

    @GetMapping("/party/{partyId}")
    public List<PoliticianDTO> getPoliticiansByPartyId(@PathVariable Long partyId) {
        return politicianService.getPoliticiansByPartyId(partyId);
    }
}
