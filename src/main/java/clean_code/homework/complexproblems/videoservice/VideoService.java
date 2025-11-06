package clean_code.homework.complexproblems.videoservice;

public class VideoService {
    private AviVideoAdapter aviVideoAdapter;
    private MovVideoAdapter movVideoAdapter;
    private WmvVideoAdapter wmvVideoAdapter;

    public VideoService(AviVideoAdapter aviVideoAdapter, MovVideoAdapter movVideoAdapter, WmvVideoAdapter wmvVideoAdapter) {
        this.aviVideoAdapter = aviVideoAdapter;
        this.movVideoAdapter = movVideoAdapter;
        this.wmvVideoAdapter = wmvVideoAdapter;
    }

    public Video uploadVideo(String videoPath) {
        Video video = null;

        if (videoPath.endsWith(".avi")) {
            video = aviVideoAdapter.convertToMp4(videoPath);
        } else if (videoPath.endsWith(".mov")) {
            video = movVideoAdapter.convertToMp4(videoPath);
        } else if (videoPath.endsWith(".wmv")) {
            video = wmvVideoAdapter.convertToMp4(videoPath);
        } else {
            System.out.println("Неподдерживаемый формат файла: " + videoPath);
            return null;
        }

        System.out.println("Video converted and uploaded in MP4 format: " + video.getConvertedPath());
        return video;
    }

    public Stream streamVideo(String videoID) {
        System.out.println("Stream video with ID: " + videoID);
        return new Stream(videoID, "Streaming MP4 video...");
    }
}