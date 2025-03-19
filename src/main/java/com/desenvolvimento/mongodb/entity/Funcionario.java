package com.desenvolvimento.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document(collection = "funcionarios")
public class Funcionario {

    @Id
    private String id;
    private String nome;
    private Integer idade;
    private String cargo;
    private String departamento;
    private Endereco endereco;
    private String formatoTrabalho;
    private double salario;

    public Funcionario(String nome, Integer idade, String cargo, String departamento, Endereco endereco, String formatoTrabalho, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.departamento = departamento;
        this.endereco = endereco;
        this.formatoTrabalho = formatoTrabalho;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getFormatoTrabalho() {
        return formatoTrabalho;
    }

    public void setFormatoTrabalho(String formatoTrabalho) {
        this.formatoTrabalho = formatoTrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Funcionario that = (Funcionario) o;
        return Double.compare(salario, that.salario) == 0 && Objects.equals(nome, that.nome) && Objects.equals(idade, that.idade) && Objects.equals(cargo, that.cargo) && Objects.equals(departamento, that.departamento) && Objects.equals(endereco, that.endereco) && Objects.equals(formatoTrabalho, that.formatoTrabalho);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nome);
        result = 31 * result + Objects.hashCode(idade);
        result = 31 * result + Objects.hashCode(cargo);
        result = 31 * result + Objects.hashCode(departamento);
        result = 31 * result + Objects.hashCode(endereco);
        result = 31 * result + Objects.hashCode(formatoTrabalho);
        result = 31 * result + Double.hashCode(salario);
        return result;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cargo='" + cargo + '\'' +
                ", departamento='" + departamento + '\'' +
                ", endereco=" + endereco +
                ", formatoTrabalho='" + formatoTrabalho + '\'' +
                ", salario=" + salario +
                '}';
    }
}
