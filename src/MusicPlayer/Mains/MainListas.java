package MusicPlayer.Mains;

import MusicPlayer.models.Mp3;
import MusicPlayer.models.Music;
import MusicPlayer.models.Podcast;

import java.util.ArrayList;
import java.util.Collections;

public class MainListas {
    public static void main(String[] args) {

        Music musica1 = new Music("Rap God", "Eminem", 2013);
        musica1.avaliar(9);
        Music musica2 = new Music("Mocking Bird", "Eminem", 2004);
        musica2.avaliar(10);
        Music musica3 = new Music("Godzilla", "Eminem", 2020);
        musica3.avaliar(8);
        Podcast podccast1 = new Podcast("Flow", "Igor 3k", 2018);
        podccast1.avaliar(9);

        ArrayList<Mp3> listaDeMusicas = new ArrayList();
        listaDeMusicas.add(musica1);
        listaDeMusicas.add(musica2);
        listaDeMusicas.add(musica3);
        listaDeMusicas.add(podccast1);
        System.out.println("O tamanho da lista é de " + listaDeMusicas.size());
        System.out.println("A primeira musica é " + listaDeMusicas.get(0).getTitulo());
        System.out.println(listaDeMusicas);
        Collections.sort(listaDeMusicas);

        for(Mp3 item: listaDeMusicas){
            System.out.println(item.getTitulo());
            item.mostrarEstrelas();
        }
    }
}
