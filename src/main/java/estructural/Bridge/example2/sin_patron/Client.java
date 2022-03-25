package estructural.Bridge.example2.sin_patron;

import estructural.Bridge.example2.sin_patron.streaming_service.StreamingService;
import estructural.Bridge.example2.sin_patron.streaming_service.YoutubeStreamingServiceCamera;

public class Client {
    public static void main(String[] args) {
        StreamingService youtube = new YoutubeStreamingServiceCamera();
        youtube.getBufferData();
    }
}
