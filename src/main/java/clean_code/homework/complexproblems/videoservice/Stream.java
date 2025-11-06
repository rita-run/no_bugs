package clean_code.homework.complexproblems.videoservice;

public class Stream {
    private String videoID;
    private String message;

    public Stream(String videoID, String message) {
        this.videoID = videoID;
        this.message = message;
    }

    public String getVideoID() {
        return videoID;
    }

    public String getMessage() {
        return message;
    }
}