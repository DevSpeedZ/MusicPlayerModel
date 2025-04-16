package Testes.Musica.models;

import Testes.Musica.Algoritmos.Classificavel;

public class User implements Classificavel {
    private String nome;
    private int idade;
    private String email;
    private int totalEstrela;
    private int numAvaliacoes;


    //getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public int getNumAvaliacoes() {
        return numAvaliacoes;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //adicionar avaliação de 0 a 5
    @Override
    public void avaliar(float nota) {
        int e = (int) nota;
        if (e >=0 && e <= 5) {
            totalEstrela += e;
            numAvaliacoes++;
        }else {
            System.out.println("Valor invalido de avaliação");
        }
    }

    //media das classificações
    @Override
    public int getClassificacao() {
        return (int) totalEstrela / numAvaliacoes;
    }

    //Mostrar estrelas
    @Override
    public void mostrarEstrelas() {
        int estrelas = getClassificacao();

        System.out.println("--------------------------");
        for (int i = 0; i < estrelas; i++) {
            System.out.print("★"); // Estrela Cheia
        }
        for (int i = estrelas; i < 5; i++) {
            System.out.print("☆"); // Estrela vazia
        }
        System.out.println();
        System.out.println("--------------------------");
    }

}
