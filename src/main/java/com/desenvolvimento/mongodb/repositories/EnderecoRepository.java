package com.desenvolvimento.mongodb.repositories;

import com.desenvolvimento.mongodb.entity.Endereco;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface EnderecoRepository extends MongoRepository<Endereco, String> {
}
