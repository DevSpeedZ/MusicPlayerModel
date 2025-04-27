package MusicPlayer.models;

public class Podcast extends Mp3{
    private String oradores;

    //metodo contrutor
    public Podcast(String titulo, String oradores, int anoLancamento) {
        super(titulo,null, anoLancamento);
        this.oradores = oradores;
    }

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

    // formatação do toString para que ao inves de mostrar artista mostrar oradores
    @Override
    public String toString() {
        return "%s (%s)".formatted(this.getTitulo(),this.oradores);
    }
}
