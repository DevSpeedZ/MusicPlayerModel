package Testes.Musica.models;

import Testes.Musica.Algoritmos.Classificavel;

public class Mp3 implements Classificavel {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private float totalAvaliacao;
    private int numAvaliacoes;
    private int duracao;

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getNumAvaliacoes() {
        return numAvaliacoes;
    }

    public int getDuracao() {
        return duracao;
    }

    public float getMediaAvaliacao(){
        return totalAvaliacao/numAvaliacoes;
    }

    //
    public void exibirFichaTecnica(){
        System.out.println("O titulo é: " + titulo);
        System.out.println("O autor é: " + artista);
        System.out.println("Foi lançado em: " + anoLancamento);
        System.out.println("O numero de avalições foi de:" + numAvaliacoes);
        System.out.println("A nota média é de " + getMediaAvaliacao());
    }

    //adicionar avaliação de 0 a 10
    public void avaliar(float nota){
        if (nota >=0 && nota <= 10) {
            totalAvaliacao += nota;
            numAvaliacoes++;
        }else {
            System.out.println("Valor invalido de avaliação");
        }
    }

    // conseguir uma classificação em estrelas (0 a 5)
    @Override
    public int getClassificacao() {
        return (int) getMediaAvaliacao() / 2;
    }

    // Mostrar as estrelas
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
