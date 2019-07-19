public class PlayerTwo extends Player implements IplaySong {

    private String nameSong;

    PlayerTwo(int price) {
        super(price);
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    @Override
    public void playSong() {
    //error todo
    }
}
