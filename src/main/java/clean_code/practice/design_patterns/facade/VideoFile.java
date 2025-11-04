package clean_code.practice.design_patterns.facade;

class VideoFile {
    String fileName;

    public VideoFile(String fileName) {
        this.fileName = fileName;
    }

    public void load() {
        System.out.println("Loading video file: " + fileName);
    }
}