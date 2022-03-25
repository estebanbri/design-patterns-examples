package estructural.Bridge.example2.con_patron.dispositivo.impl;

import estructural.Bridge.example2.con_patron.dispositivo.Dispositivo;

public class Camara implements Dispositivo {
    @Override
    public String getBufferData() {
        return "###camera-data###";
    }
}
