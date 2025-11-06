package clean_code.homework.complexproblems.videoservice;

import java.util.UUID;

public class AviVideoAdapter implements VideoAdapter {
    @Override
    public Video convertToMp4(String filePath) {
        System.out.println("Video converted to MP4 format");

        String convertedPath = filePath.substring(0, filePath.lastIndexOf('.')) + ".mp4";

        return new Video(
                UUID.randomUUID().toString(),
                filePath,
                convertedPath,
                "mp4"
        );        }
}