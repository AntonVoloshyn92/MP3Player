public class PlayerOne extends Player implements IplaySong {
    private String nameSong;
    private int count = 0;

    PlayerOne(int price) {
        super(price);
    }

    public void setNameSong(String nameSong) {
        if (count == 0) {
            this.nameSong = nameSong;
            count++;
        } else {
            System.out.println("This Player can remember only one song");
            nameSong = this.nameSong;
        }
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + nameSong);
    }
}
