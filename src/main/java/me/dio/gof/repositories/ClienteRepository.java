package me.dio.gof.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.dio.gof.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
