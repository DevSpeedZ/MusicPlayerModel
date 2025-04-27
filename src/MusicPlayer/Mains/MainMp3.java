package MusicPlayer.Mains;

import MusicPlayer.Algoritmos.Recomendacao;
import MusicPlayer.models.Mp3;
import MusicPlayer.models.Music;
import MusicPlayer.models.User;

import java.util.ArrayList;

public class MainMp3 {
    public static void main(String[] args) {

        Recomendacao recomendacao = new Recomendacao();

        Music musica1 = new Music("Rap God","Eminem",2013);
        musica1.setEstilo("Rap");
        musica1.setDuracao(403);
        musica1.exibirFichaTecnica();

        Music musica2 = new Music("Mocking Bird","Eminem",2004);
        musica2.setEstilo("Rap");
        musica2.setDuracao(268);

        Music musica3 = new Music("Godzilla","Eminem",2020);
        musica3.setEstilo("Rap");
        musica3.setDuracao(267);



        User User1 = new User("Samuel Trovo Botelho",18,"sambotelho07@gmail.com");
        User1.avaliar(5);

        System.out.println(User1.getClassificacao());
        User1.mostrarEstrelas();
        recomendacao.eRecomendado(User1);

        ArrayList<Mp3> listaDeMusicas = new ArrayList();
        listaDeMusicas.add(musica1);
        listaDeMusicas.add(musica2);
        listaDeMusicas.add(musica3);
        System.out.println("O tamanho da lista é de " + listaDeMusicas.size());
        System.out.println("A primeira musica é " + listaDeMusicas.get(0).getTitulo());
        System.out.println(listaDeMusicas);

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