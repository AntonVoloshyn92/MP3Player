import java.util.ArrayList;
import java.util.List;

public class PlayerFour extends Player implements IplayAllSong, IplaySong {

    List<String> playlist = new ArrayList<>();

    PlayerFour(int price) {
        super(price);
    }

    @Override
    public void playAllSong() {
        for (String s : playlist) {
            System.out.println("Playing: " + s);
        }
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + playlist.get(playlist.size()-1));
    }
}
