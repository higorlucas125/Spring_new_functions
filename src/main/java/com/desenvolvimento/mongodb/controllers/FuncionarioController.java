package com.desenvolvimento.mongodb.controllers;

import com.desenvolvimento.mongodb.entity.Funcionario;
import com.desenvolvimento.mongodb.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/")
    public ResponseEntity<String> inicio() {
        String resposta = """
                   <html>
                        <body>
                            <h1>API REST - Funcionários</h1>
                            <h2>Endpoints:</h2>
                            <ul>
                                <li><a href="/listarFuncionarios">1 - Listar Funcionários</a></li>
                                <li><a href="/listarCidadesFuncionarios">2 - Listar Funcionários</a></li>
                            </ul>
                        </body>    
                   </html>
                """;

        return new ResponseEntity<>(resposta, HttpStatus.OK);
    }

    @GetMapping("/listarFuncionarios")
    public ResponseEntity<List<Funcionario>> listarFuncionarios() {
        return new ResponseEntity<>(funcionarioService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/listarCidadesFuncionarios")
    public ResponseEntity<List<String>> listarCidadesFuncionarios() {
        return  new ResponseEntity<>(funcionarioService.listAllCityOfFuncionario(), HttpStatus.OK);
    }

}
