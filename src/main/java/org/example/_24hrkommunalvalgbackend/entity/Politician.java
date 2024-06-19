package org.example._24hrkommunalvalgbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Politician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "party_id")
    private Party party;
}
