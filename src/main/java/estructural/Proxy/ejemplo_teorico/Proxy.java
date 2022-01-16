package estructural.Proxy.ejemplo_teorico;

public class Proxy implements Subject {

    RealSubject realSubject = new RealSubject();

    @Override
    public void doAction() {  // Start point
        realSubject.doAction();  // Delegates request to RealSubject  
    }
    
}
