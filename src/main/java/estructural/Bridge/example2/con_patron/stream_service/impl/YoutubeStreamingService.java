package estructural.Bridge.example2.con_patron.stream_service.impl;

import estructural.Bridge.example2.con_patron.dispositivo.Dispositivo;
import estructural.Bridge.example2.con_patron.stream_service.StreamingServiceBase;

public class YoutubeStreamingService extends StreamingServiceBase {

    public YoutubeStreamingService(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void startStreaming() {

    }

    @Override
    public void fillBuffer() {
        System.out.println("");
    }
}
