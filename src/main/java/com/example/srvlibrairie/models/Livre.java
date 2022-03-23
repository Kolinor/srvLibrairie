package com.example.srvlibrairie.models;

import javax.persistence.*;

@Entity
@Table(name = "livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "livre_id", nullable = false, unique = false)
    private int livreId;

    @Column(length = 80)
    private String titre;

    @Column(length = 1000)
    private String resume;

    @ManyToOne
    @JoinColumn(name="auteur_id", nullable=false)
    private Auteur auteur;
}
