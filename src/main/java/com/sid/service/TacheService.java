package com.sid.service;

import com.sid.domain.Tache;

public interface TacheService {
    Iterable<Tache> listTaches();
    Tache AjouterTache(Tache tache);
}
