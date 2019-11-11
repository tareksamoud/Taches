package com.sid.repository;

import com.sid.domain.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TacheRepository extends JpaRepository<Tache, Long> {
}
