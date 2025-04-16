package MusicPlayer.Algoritmos;

public class Recomendacao {

    public void eRecomendado(Classificavel classificavel /*passando como parametro um objeto que tenha classificavel implementavel */ ){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Esta com uma nota ÓTIMA");
        } else if (classificavel.getClassificacao() == 3) {
            System.out.println("Esta com uma nota boa");
        }else {
            System.out.println("Esta com uma nota questionavel");
        }

    }

}
