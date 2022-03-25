package estructural.Bridge.example2.con_patron.stream_service.impl;

import estructural.Bridge.example2.con_patron.dispositivo.Dispositivo;
import estructural.Bridge.example2.con_patron.stream_service.StreamingServiceBase;

public class TwitchStreamingService extends StreamingServiceBase {

    public TwitchStreamingService(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void startStreaming() {
        System.out.println("Twitch stream started with data buffered: " + this.bufferData);
    }

    @Override
    public void fillBuffer() {
        this.bufferData = dispositivo.getBufferData();
        System.out.println("Buffered Data recibida de dispositivo: " + this.bufferData);
    }
}
