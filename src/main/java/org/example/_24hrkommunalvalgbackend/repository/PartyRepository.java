package org.example._24hrkommunalvalgbackend.repository;

import org.example._24hrkommunalvalgbackend.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, Long> {
}
