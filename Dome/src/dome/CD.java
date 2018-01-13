package dome;

public class CD extends Item {

    private String title;
    private String artist;
    private int numofTracks;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        this.title = title;
        this.artist = artist;
        this.numofTracks = numofTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public void print() {


    }
}
