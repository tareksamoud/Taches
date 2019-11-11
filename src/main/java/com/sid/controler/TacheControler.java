package com.sid.controler;

import com.sid.domain.Tache;
import com.sid.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/api/tasks")
public class TacheControler {
    @Autowired
    private TacheService tacheService;

    @GetMapping(value = {"","/","/listTaches"})
    public Iterable<Tache> getAllTache(){
        return this.tacheService.listTaches();
    }

    @PostMapping(value = "/ajouterTache")
    public Tache saveTache(@RequestBody Tache t){
        return this.tacheService.AjouterTache(t);
    }
}
