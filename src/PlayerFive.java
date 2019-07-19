import java.util.ArrayList;
import java.util.List;

public class PlayerFive extends Player implements IplaySong, IplayAllSong {

    List<String> playlist = new ArrayList<>();

    PlayerFive(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + playlist.get(0));
    }

    @Override
    public void playAllSong() {
        for (int i = playlist.size() - 1; i >= 0; i--) {
            System.out.println(playlist.get(i));
        }
    }
}
//Плеер 5.
//        Имеет final цену(задается в конструкторе) и геттер
//        Имеет плейлист
//        playSong Может проиграть первую песню
//        playAllSongs может проиграть все песни с конца плейлиста в начало
