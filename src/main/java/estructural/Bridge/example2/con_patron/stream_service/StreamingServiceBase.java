package estructural.Bridge.example2.con_patron.stream_service;

import estructural.Bridge.example2.con_patron.dispositivo.Dispositivo;

public abstract class StreamingServiceBase {

    protected Dispositivo dispositivo;  // Composition (StreamingService uses a Dispositivo)
    protected String bufferData;

    protected StreamingServiceBase(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void startStreaming();
    public abstract void fillBuffer();
}
