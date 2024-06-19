package org.example._24hrkommunalvalgbackend.repository;

import org.example._24hrkommunalvalgbackend.entity.Politician;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PoliticianRepository extends JpaRepository<Politician, Long> {
    List<Politician> findByPartyId(Long partyId);
}
