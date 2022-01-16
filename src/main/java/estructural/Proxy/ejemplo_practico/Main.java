package estructural.Proxy.ejemplo_practico;

public class Main {
    public static void main (String... args) {
        Server server = new ProxyServer();
        server.connect("juan");
        server.connect("maria");
    }

    
}
