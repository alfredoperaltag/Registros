package com.example.registro.repositorios;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.registro.entidades.Registro;

@Repository("RegistroRepository")
public interface RegistroRepository extends CrudRepository<Registro, Serializable>{

}
