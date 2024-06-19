package org.example._24hrkommunalvalgbackend.controller;

import org.example._24hrkommunalvalgbackend.dto.VoteDTO;
import org.example._24hrkommunalvalgbackend.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/votes")
public class VoteController {
    @Autowired
    private VoteService voteService;

    @GetMapping
    public List<VoteDTO> getAllVotes() {
        return voteService.getAllVotes();
    }

    @GetMapping("/{id}")
    public VoteDTO getVoteById(@PathVariable Long id) {
        return voteService.getVoteById(id);
    }

    @PostMapping
    public VoteDTO createVote(@RequestBody VoteDTO voteDTO) {
        return voteService.createVote(voteDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteVote(@PathVariable Long id) {
        voteService.deleteVote(id);
    }
}
