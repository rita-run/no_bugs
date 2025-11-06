package clean_code.homework.complexproblems.videoservice;

public class Main {
    public static void main(String[] args) {
        VideoService service = new VideoService(new AviVideoAdapter(), new MovVideoAdapter(), new WmvVideoAdapter());
        String videoPath = "path/to/example.avi";

        Video video = service.uploadVideo(videoPath);
        System.out.println();
        Stream stream = service.streamVideo(video.getVideoID());
        System.out.println("Stream video in MP4 format, Video ID: " + video.getVideoID());
    }
}