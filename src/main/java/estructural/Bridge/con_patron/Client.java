package estructural.Bridge.con_patron;

import estructural.Bridge.con_patron.gateway.impl.BBVAPaymentGateway;
import estructural.Bridge.con_patron.payment.Payment;
import estructural.Bridge.con_patron.payment.impl.CardPayment;

public class Client {
    public static void main(String[] args) {
        Payment card = new CardPayment(new BBVAPaymentGateway());
        card.makePayment();
    }
}
