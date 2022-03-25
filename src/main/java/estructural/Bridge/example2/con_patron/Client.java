package estructural.Bridge.example2.con_patron;

import estructural.Bridge.example2.con_patron.dispositivo.impl.WebCam;
import estructural.Bridge.example2.con_patron.stream_service.StreamingServiceBase;
import estructural.Bridge.example2.con_patron.stream_service.impl.TwitchStreamingService;

public class Client {
    public static void main(String[] args) {
        StreamingServiceBase youtube = new TwitchStreamingService(new WebCam());
        youtube.fillBuffer();
        youtube.startStreaming();
    }
}
