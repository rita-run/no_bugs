package clean_code.homework.complexproblems.videoservice;

public class Video {
    private String videoID;
    private String originalPath;
    private String convertedPath;
    private String format;

    public Video(String videoID, String originalPath, String convertedPath, String format) {
        this.videoID = videoID;
        this.originalPath = originalPath;
        this.convertedPath = convertedPath;
        this.format = format;
    }

    public String getVideoID() {
        return videoID;
    }

    public String getOriginalPath() {
        return originalPath;
    }

    public String getConvertedPath() {
        return convertedPath;
    }

    public String getFormat() {
        return format;
    }
}