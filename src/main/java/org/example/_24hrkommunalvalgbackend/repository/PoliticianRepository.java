package org.example._24hrkommunalvalgbackend.repository;

import org.example._24hrkommunalvalgbackend.entity.Politician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliticianRepository extends JpaRepository<Politician, Long> {
}
