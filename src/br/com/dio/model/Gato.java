package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private Stringer nome;
    private Stringer cor;
    private Integer idade;

    public Gato() {}

    public Gato(Stringer nome, Stringer cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public Stringer getNome() {
        return nome;
    }

    public void setNome(Stringer nome) {
        this.nome = nome;
    }

    public Stringer getCor() {
        return cor;
    }

    public void setCor(Stringer cor) {
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
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome=" + nome +
                ", cor=" + cor +
                ", idade=" + idade +
                '}';
    }
}
