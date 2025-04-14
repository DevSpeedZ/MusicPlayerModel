package Testes.Musica.models;

public class Podcast extends Mp3{
    private String oradores;

    public String getOradores() {
        return oradores;
    }

    public void setOradores(String oradores) {
        this.oradores = oradores;
    }

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Os oradores são: " + oradores);
    }
}
