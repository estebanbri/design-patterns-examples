package estructural.Bridge.example2.sin_patron.streaming_service;

public class YoutubeStreamingServiceWebcam implements StreamingService {

    @Override
    public String getBufferData() {
        // Logica de extraccion de datos buffer de la camara
        return "###webcam-data###";
    }
}
