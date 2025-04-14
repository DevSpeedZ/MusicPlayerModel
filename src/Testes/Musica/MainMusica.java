package Testes.Musica;

import Testes.Musica.models.Mp3;
import Testes.Musica.models.Music;

public class MainMusica {
    public static void main(String[] args) {

        Music musica1 = new Music();
        musica1.setTitulo("Rap God");
        musica1.setArtista("Eminem");
        musica1.setEstilo("Rap");
        musica1.setAnoLancamento(2013);

        musica1.avaliar(9);
        musica1.avaliar(10);
        musica1.exibirFichaTecnica();

    }


}