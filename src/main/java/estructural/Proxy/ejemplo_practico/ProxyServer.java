package estructural.Proxy.ejemplo_practico;

import java.util.List;
import java.util.Arrays;
import java.util.Date;

public class ProxyServer  implements Server {

    private ProductionServer productionServer = new ProductionServer();
    private static final String CONECCTION_REFUSE_MSJ = "Usuario %s no autorizado para conectarse al server productivo (%s)";
    
    @Override
    public boolean connect(String username) {
        if (!getEmployees().contains(username)) {
            System.out.println(String.format(CONECCTION_REFUSE_MSJ, username, new Date()));
            return false;
        }
        return productionServer.connect(username);
    }

    private List<String> getEmployees() {
        return Arrays.asList("juan", "jose", "pedro");
    }
    
}
