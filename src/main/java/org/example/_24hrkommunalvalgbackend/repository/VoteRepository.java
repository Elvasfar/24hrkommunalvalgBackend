package org.example._24hrkommunalvalgbackend.repository;

import org.example._24hrkommunalvalgbackend.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
