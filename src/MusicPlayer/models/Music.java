package MusicPlayer.models;

public class Music extends Mp3 {
    private String estilo;


    //metodo contrutor
    public Music(String titulo, String artista, int anoLancamento) {
        super(titulo, artista, anoLancamento);
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("O estilo musical é: " + estilo);
    }
}
