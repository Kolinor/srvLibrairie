package com.example.srvlibrairie.services;

import com.example.srvlibrairie.models.Auteur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurService {
    private IUserRepository repository;

    public AuteurService(IUserRepository repository) {
        this.repository = repository;
    }

    public Auteur saveUser(Auteur user) {
        return repository.save(user);
    }

    public List<Auteur> getAllUsers() {
        return repository.findAll();
    }

    public Auteur getUserById(int id) {
        return repository.findById(id).get();
    }
}
