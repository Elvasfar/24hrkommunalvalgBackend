package org.example._24hrkommunalvalgbackend.service;

import org.example._24hrkommunalvalgbackend.dto.VoteDTO;
import org.example._24hrkommunalvalgbackend.entity.Vote;
import org.example._24hrkommunalvalgbackend.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public List<VoteDTO> getAllVotes() {
        return voteRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public VoteDTO getVoteById(Long id) {
        return voteRepository.findById(id).map(this::convertToDTO).orElse(null);
    }

    public VoteDTO createVote(VoteDTO voteDTO) {
        if ((voteDTO.getPoliticianId() == null && voteDTO.getPartyId() == null) ||
                (voteDTO.getPoliticianId() != null && voteDTO.getPartyId() != null)) {
            throw new IllegalArgumentException("Vote must be for either a politician or a party, but not both.");
        }

        Vote vote = convertToEntity(voteDTO);
        Vote savedVote = voteRepository.save(vote);
        return convertToDTO(savedVote);
    }

    public void deleteVote(Long id) {
        voteRepository.deleteById(id);
    }

    private VoteDTO convertToDTO(Vote vote) {
        VoteDTO voteDTO = new VoteDTO();
        voteDTO.setId(vote.getId());
        voteDTO.setPoliticianId(vote.getPoliticianId());
        voteDTO.setPartyId(vote.getPartyId());
        return voteDTO;
    }

    private Vote convertToEntity(VoteDTO voteDTO) {
        Vote vote = new Vote();
        vote.setPoliticianId(voteDTO.getPoliticianId());
        vote.setPartyId(voteDTO.getPartyId());
        return vote;
    }
}
