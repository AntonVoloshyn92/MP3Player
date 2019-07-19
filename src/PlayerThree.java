import java.util.ArrayList;
import java.util.List;

public class PlayerThree extends Player implements IplaySong, IplayAllSong {

    List<String> playlist = new ArrayList<>();

    PlayerThree(int price) {
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
        System.out.println("Playing: " + playlist.get(0));
    }
}
