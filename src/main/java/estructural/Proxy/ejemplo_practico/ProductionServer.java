package estructural.Proxy.ejemplo_practico;

import java.util.Date;

public class ProductionServer implements Server {

    private static final String CONECCTION_SUCCESS_MSJ = "Registro de conexion ** exitoso ** al server productivo de %s (%s)";

    @Override
    public boolean connect(String username) {
        System.out.println(String.format(CONECCTION_SUCCESS_MSJ, username, new Date()));
        return true;
    }
    
}
