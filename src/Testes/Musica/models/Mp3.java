package Testes.Musica.models;

public class Mp3 {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private float totalAvaliacao;
    private int numAvaliacoes;

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


    public void avaliar(float nota){
        totalAvaliacao += nota;
        numAvaliacoes++;
        getMediaAvaliacao();
    }
}
