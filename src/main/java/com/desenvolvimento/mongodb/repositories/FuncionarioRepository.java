package com.desenvolvimento.mongodb.repositories;

import com.desenvolvimento.mongodb.entity.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
}
