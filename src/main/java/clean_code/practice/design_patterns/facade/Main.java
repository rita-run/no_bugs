package clean_code.practice.design_patterns.facade;

public class Main {
    public static void main(String[] args) {
        VideoFile videoFile = new VideoFile("example.mp4");
        CodecConverter codecConverter = new CodecConverter();
        AudioMixer audioMixer = new AudioMixer();

        MultimediaFacade multimediaFacade = new MultimediaFacade(videoFile, codecConverter, audioMixer);
        multimediaFacade.prepareData();
    }
}