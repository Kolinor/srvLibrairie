package com.example.srvlibrairie.models;

import javax.persistence.*;

@Entity
@Table(name = "auteur")
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auteur_id", nullable = false, unique = false)
    private int auteurId;

    @Column(length = 80)
    private String nom;

    @Column(length = 80)
    private String prenom;

    @Column
    private int age;
}
