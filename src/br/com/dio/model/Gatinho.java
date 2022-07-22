package br.com.dio.model;

import java.util.Objects;

public class Gatinho {
    private  String nome;
    private String cor;
    private Integer idade;

    public Gatinho() {}

    public Gatinho(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gatinho gatinho = (Gatinho) o;
        return Objects.equals(nome, gatinho.nome) && Objects.equals(cor, gatinho.cor) && Objects.equals(idade, gatinho.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);

    }

    @Override
    public String toString() {
        return "Gatinho{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
