package com.sid.service;

import com.sid.domain.Tache;
import com.sid.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TacheServiceImp implements TacheService {
    @Autowired
    private TacheRepository tacheRepository;

    @Override
    public Iterable<Tache> listTaches() {
        return this.tacheRepository.findAll();
    }

    @Override
    public Tache AjouterTache(Tache tache) {
        return tacheRepository.save(tache);
    }
}
