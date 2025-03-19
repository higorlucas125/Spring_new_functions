package com.desenvolvimento.mongodb.services;

import com.desenvolvimento.mongodb.entity.Funcionario;
import com.desenvolvimento.mongodb.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioServiceImpl(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public List<Funcionario> listAll() {
        return funcionarioRepository.findAll();
    }
}
