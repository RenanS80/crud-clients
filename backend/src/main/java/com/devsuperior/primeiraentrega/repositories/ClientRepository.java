package com.devsuperior.primeiraentrega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.primeiraentrega.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
