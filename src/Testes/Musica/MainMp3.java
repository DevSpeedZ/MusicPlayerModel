package Testes.Musica;

import Testes.Musica.Algoritmos.Fila;
import Testes.Musica.Algoritmos.Recomendacao;
import Testes.Musica.models.Music;
import Testes.Musica.models.User;

public class MainMp3 {
    public static void main(String[] args) {

        Recomendacao recomendacao = new Recomendacao();

        Music musica1 = new Music();
        musica1.setTitulo("Rap God");
        musica1.setArtista("Eminem");
        musica1.setEstilo("Rap");
        musica1.setDuracao(610);
        musica1.setAnoLancamento(2013);

        Music musica2 = new Music();
        musica2.setTitulo("Mocking Bird");
        musica2.setArtista("Eminem");
        musica2.setEstilo("Rap");
        musica2.setDuracao(268);
        musica2.setAnoLancamento(2004);

        User User1 = new User();
        User1.setNome("Samuel Trovo Botelho");
        User1.setIdade(18);
        User1.setEmail("sambotelho07@gmail.com");
        User1.avaliar(5);
        User1.avaliar(5);
        User1.avaliar(5);
        User1.avaliar(5);
        User1.avaliar(1);
        User1.avaliar(6);
        System.out.println(User1.getClassificacao());
        User1.mostrarEstrelas();
        recomendacao.eRecomendado(User1);

        /*
        musica1.avaliar(9);
        musica1.avaliar(10);
        musica1.exibirFichaTecnica();
        System.out.println(musica1.getClassificacao());
        musica1.mostrarEstrelas();

        recomendacao.eRecomendado(musica1);
        */

        /*
        Fila fila = new Fila();
        fila.adicionarAFila(musica2);
        fila.adicionarAFila(musica1);
        System.out.println(fila.getTempoDeFila());
        */

    }


}