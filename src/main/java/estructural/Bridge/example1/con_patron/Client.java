package estructural.Bridge.example1.con_patron;

import estructural.Bridge.example1.con_patron.gateway.impl.BBVAPaymentGateway;
import estructural.Bridge.example1.con_patron.payment.Payment;
import estructural.Bridge.example1.con_patron.payment.impl.CardPayment;

public class Client {
    public static void main(String[] args) {
        Payment card = new CardPayment(new BBVAPaymentGateway());
        card.makePayment();
    }
}
