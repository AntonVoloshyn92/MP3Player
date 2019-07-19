package petia;

public class PlayerWithPlayList extends BeisePlayer {
    String[] playLIst;

    void playAllSong(){
        for (String s: playLIst){
            System.out.println(s);
        }
    }
}
