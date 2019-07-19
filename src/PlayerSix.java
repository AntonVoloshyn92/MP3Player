import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerSix extends Player implements IplaySong, IplayAllSong {

    List<String> playlist = new ArrayList<>();

    PlayerSix(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + playlist.get(0));
    }

    @Override
    public void playAllSong() {
        for (String s : playlist) {
            System.out.println("Playing: " + s);
        }
    }

    public void shuffle() {
        Collections.shuffle(playlist);
    }
}
//Плеер 6.
//        Имеет final цену(задается в конструкторе) и геттер
//        Имеет плейлист
//        playSong Может проиграть первую песню
//        playAllSongs может проиграть все песни
//        Имеет метод public void shuffle() - перемешивает все песни в плейлисте местами
