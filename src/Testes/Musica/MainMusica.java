package Testes.Musica;

import Testes.Musica.Fila.Fila;
import Testes.Musica.models.Music;

public class MainMusica {
    public static void main(String[] args) {

        Music musica1 = new Music();
        musica1.setTitulo("Rap God");
        musica1.setArtista("Eminem");
        musica1.setEstilo("Rap");
        musica1.setDuracao(610);
        musica1.setAnoLancamento(2013);

        musica1.avaliar(9);
        musica1.avaliar(10);
        musica1.exibirFichaTecnica();

        Music musica2 = new Music();
        musica2.setTitulo("Mocking Bird");
        musica2.setArtista("Eminem");
        musica2.setEstilo("Rap");
        musica2.setDuracao(268);
        musica2.setAnoLancamento(2004);

        Fila fila = new Fila();
        fila.adicionarAFila(musica2);
        fila.adicionarAFila(musica1);
        System.out.println(fila.getTempoDeFila());


    }


}