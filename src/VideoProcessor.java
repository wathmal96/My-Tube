public class VideoProcessor {
    private Encodable encodable;
    private Storable storable;
    private Sendable sendable;

    public VideoProcessor(Encodable encodable, Storable storable, Sendable sendable) {
        this.encodable = encodable;
        this.storable = storable;
        this.sendable = sendable;
    }

    public void process(Video video){
        encodable.encode(video);
        storable.store(video);
        sendable.sendEmail(video.getUser());
    }
}
