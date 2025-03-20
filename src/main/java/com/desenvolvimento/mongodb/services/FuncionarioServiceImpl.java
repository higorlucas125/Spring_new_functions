package com.desenvolvimento.mongodb.services;

import com.desenvolvimento.mongodb.entity.Endereco;
import com.desenvolvimento.mongodb.entity.Funcionario;
import com.desenvolvimento.mongodb.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public List<String> listAllCityOfFuncionario() {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        return funcionarios.stream()
                .map(Funcionario::getEndereco)
                .filter(Objects::nonNull)
                .map(Endereco::getCidade)
                .filter(Objects::nonNull)
                .distinct()
                .toList();
    }
}
