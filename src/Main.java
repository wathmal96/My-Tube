public class Main {
    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthDay.mp4");
        video.setTitle("jennifer's birthday");
        video.setUser(new User("john@domain"));

        var processor = new VideoProcessor(new VideoEncoder(),new VideoDataBase(),new EmailService());
        processor.process(video);
    }
}
