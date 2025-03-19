package com.desenvolvimento.mongodb.config;

import com.desenvolvimento.mongodb.entity.Endereco;
import com.desenvolvimento.mongodb.entity.Funcionario;
import com.desenvolvimento.mongodb.repositories.EnderecoRepository;
import com.desenvolvimento.mongodb.repositories.FuncionarioRepository;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DbInit {

    private Logger logger = LoggerFactory.getLogger(DbInit.class);

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostConstruct
    private void postConstruct() {


        Endereco endereco1 = new Endereco("Rua das Palmeiras", "Centro", "123", "Apto 101", "12345-678", "São Paulo", "SP");
        Endereco endereco2 = new Endereco("Avenida Brasil", "Vila Nova", "456", "Casa 2", "23456-789", "Rio de Janeiro", "RJ");
        Endereco endereco3 = new Endereco("Rua das Acácias", "Jardim Planalto", "789", "Sala 3", "34567-890", "Belo Horizonte", "MG");
        Endereco endereco4 = new Endereco("Rua dos Lírios", "Santa Teresa", "101", "Apto 202", "45678-901", "Curitiba", "PR");
        Endereco endereco5 = new Endereco("Rua dos Girassóis", "Vila Madalena", "202", "Casa 4", "56789-012", "Porto Alegre", "RS");
        Endereco endereco6 = new Endereco("Avenida das Américas", "Barra da Tijuca", "303", "Sala 5", "67890-123", "Salvador", "BA");
        Endereco endereco7 = new Endereco("Rua do Sol", "Alto da Lapa", "404", "Apto 306", "78901-234", "Fortaleza", "CE");
        Endereco endereco8 = new Endereco("Rua das Orquídeas", "Lagoa do Abate", "505", "Casa 6", "89012-345", "Manaus", "AM");
        Endereco endereco9 = new Endereco("Avenida dos Eucaliptos", "Bairro Novo", "606", "Sala 7", "90123-456", "Recife", "PE");
        Endereco endereco10 = new Endereco("Rua do Parque", "São José", "707", "Apto 408", "01234-567", "Vitória", "ES");

        Funcionario funcionario1 = new Funcionario("Ana Souza", 30, "Gerente", "RH", endereco1, "Presencial", 6000.00);
        Funcionario funcionario2 = new Funcionario("Carlos Silva", 28, "Analista", "TI", endereco2, "Home Office", 4500.00);
        Funcionario funcionario3 = new Funcionario("Mariana Oliveira", 35, "Coordenadora", "Financeiro", endereco3, "Presencial", 8000.00);
        Funcionario funcionario4 = new Funcionario("João Pereira", 40, "Diretor", "Marketing", endereco4, "Home Office", 12000.00);
        Funcionario funcionario5 = new Funcionario("Patrícia Santos", 27, "Assistente", "Vendas", endereco5, "Presencial", 3500.00);
        Funcionario funcionario6 = new Funcionario("Fernando Alves", 33, "Supervisor", "Operações", endereco6, "Presencial", 5500.00);
        Funcionario funcionario7 = new Funcionario("Larissa Costa", 29, "Analista", "TI", endereco7, "Home Office", 4000.00);
        Funcionario funcionario8 = new Funcionario("Eduardo Martins", 38, "Gerente", "Comercial", endereco8, "Presencial", 7500.00);
        Funcionario funcionario9 = new Funcionario("Gisele Rocha", 31, "Coordenadora", "RH", endereco9, "Home Office", 7000.00);
        Funcionario funcionario10 = new Funcionario("Ricardo Lima", 45, "Diretor", "Financeiro", endereco10, "Presencial", 15000.00);

        funcionarioRepository.saveAll(List.of(funcionario1, funcionario2, funcionario3, funcionario4, funcionario5, funcionario6, funcionario7, funcionario8, funcionario9, funcionario10));
        enderecoRepository.saveAll(List.of(endereco1, endereco2, endereco3, endereco4, endereco5, endereco6, endereco7, endereco8, endereco9, endereco10));

    }
}
